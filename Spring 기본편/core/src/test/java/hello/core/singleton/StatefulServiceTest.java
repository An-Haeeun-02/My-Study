package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TeatConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //사용지 1이 1000원 주문
        statefulService1.order("userA", 1000);

        //사용자 2가 20000원 주문
        statefulService2.order("userB", 2000);

        //사용자 1의 주문 금액 조회
        int price = statefulService1.getPrice(); //10000
        System.out.println("price= " + price); //그러면 10000원이 출력 되야 하는데 20000 출력
        //왜? 중간에 사용자 2로 바뀜 statefulService1과 statefulService2은 같은 인스턴스를 사용
    }

    static class TeatConfig{

        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }

    }



}