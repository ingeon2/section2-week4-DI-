package com.codestates.section2week4;

import com.codestates.section2week4.coffee.CoffeeRepository;
import com.codestates.section2week4.coffee.CoffeeService;
import com.codestates.section2week4.member.MemberRepository;
import com.codestates.section2week4.member.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan //얘떄문에 아래 얘들 주석처리한것, @Component 찾아서 전부 Bean으로 만들어줌
@Configuration
public class DependencyConfig { //아래 매서드들 DI를 위해 만든 매서드 (생성자 아님)
                                //여기서 생성해서 주입해줌. 인터페이스의 하위 클래스에 따라 다르게 구현되어지는 클래스들은
                                // (여기서는 인터페이스없이 하나클래스만 구현됨 오해말것)
   /*                             //아래에서 memberRepository() 나 coffeeRepository() 를 변경해주면 됨.
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }
    @Bean
    public CoffeeService coffeeService() {
        return new CoffeeService(coffeeRepository());
    }
    @Bean
    public CoffeeRepository coffeeRepository() {
        return new CoffeeRepository();
    }
    */
}