package hello.core.Discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){//VIP면
            return discountFixAmount; //discountFixAmount만큼 할인
        } else {
            return 0;//아니면 할인 없음
        }
    }
}
