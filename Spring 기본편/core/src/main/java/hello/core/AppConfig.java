package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//무언가 변경사항이 있을때 이 구성영역만. 즉, 클라이언트 코드를 변경하지 않고 바꾼다.
@Configuration //설정정보, 구성정보
public class AppConfig { //구현객체 생성
    @Bean
    public MemberService memberService(){//생성자 주입 MemberService역황
        return new MemberServiceImpl(memberRepository());//구현
    }

    @Bean
    public MemberRepository memberRepository() {//Memberrepository 역활
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){//OrderService 역할
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();  //할인정책 변경
    }
}
