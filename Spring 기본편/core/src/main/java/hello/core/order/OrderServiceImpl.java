package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;

public class OrderServiceImpl implements OrderService {

//    private final MemberRepository memberRepository = new MemoryMemberRepository();
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); 고정 할인일 때 , 추상에도 의존, 구체에 의존 -> ocp위반
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); //정률 할인일때 바꾸기
//    private DiscountPolicy discountPolicy; //인터페이스에 의존하도록 코드 수정

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;// 구체적인 클래스는 모르고 오로지 인터페이스에 의존

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itName, int itemPrice) {
        Member member = memberRepository.findById(memberId); //회원정보 조회
        int discountPrice = discountPolicy.discount(member, itemPrice); //할인정책에 넘김

        return new Order(memberId, itName, itemPrice, discountPrice);
    }

    //테스트용
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
