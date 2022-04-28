package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {
    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);
/*
    // singleton 패턴에서 발생할 수 있는 문제점이 발생한 코드

        // Thread A : A사용자가 10000원 주문
        statefulService1.order("UserA",10000);
        // Thread B : B사용자가 20000원 주문
        statefulService2.order("UserB",20000);

        // Thead A: 사용자A의 주문 금액 조회
        int userAPrice = statefulService1.getPrice();
        System.out.println("userA Price = "+userAPrice);

        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);
 */
        /* singleton 패턴에서 발생할 수 있는 문제점을 해결한 코드 - 공유필드 없애기 */
        // Thread A : A사용자가 10000원 주문
        int userAPrice = statefulService1.order("UserA",10000);
        // Thread B : B사용자가 20000원 주문
        int userBPrice = statefulService2.order("UserB",20000);

        System.out.println("userA Price = "+userAPrice);
    }

    static class TestConfig{
        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }
}
