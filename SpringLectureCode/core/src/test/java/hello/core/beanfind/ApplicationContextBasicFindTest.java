package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
        @DisplayName("Find Bean by Name")
    void findBeanByName(){
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        System.out.println("memberService = "+memberService);
        System.out.println("memberService = "+memberService.getClass());

        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("Find Bean by not Name but Type")
    void findBeanByType(){
        MemberService memberService = ac.getBean(MemberService.class);
        System.out.println("memberService = "+memberService);
        System.out.println("memberService = "+memberService.getClass());

        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("Find Bean by 구체타입")
    void findBeanByName2(){
        MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
        System.out.println("memberService = "+memberService);
        System.out.println("memberService = "+memberService.getClass());

        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("Find Bean by Name : Fail Case")
    void findBeanByNameX(){
//        MemberService xxxx = ac.getBean("xxxx", MemberService.class);
        org.junit.jupiter.api.Assertions.assertThrows(NoSuchBeanDefinitionException.class, ()->ac.getBean("xxxx", MemberService.class));
    }
}
