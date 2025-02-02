package hello.core;

import hello.core.Discount.DiscountPolicy;
import hello.core.Discount.FixDiscountPolicy;
import hello.core.Discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

//무언가 변경사항이 있을때 이 구성영역만. 즉, 클라이언트 코드를 변경하지 않고 바꾼다.
public class AppConfig { //구현객체 생성

    public MemberService memberService(){//생성자 주입 MemberService역황
        return new MemberServiceImpl(memberRepository());//구현
    }

    private MemberRepository memberRepository() {//Memberrepository 역활
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){//OrderService 역할
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();  //할인정책 변경
    }
}
