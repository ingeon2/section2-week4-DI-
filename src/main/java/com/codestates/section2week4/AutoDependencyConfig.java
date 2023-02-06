package com.codestates.section2week4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*@ComponentScan은 @Component가 붙은 모든 클래스를 스프링 빈으로 등록해주기 때문에 설정 정보에 붙여주면 됩니다.
의존관계도 자동으로 주입하는 @Autowired 기능도 제공합니다.*/
@ComponentScan
@Configuration //@Configuration이 붙은 설정 정보가 자동 등록되는 이유는 @Configuration 코드에 @Component 애너테이션이 붙어있기 때문
public class AutoDependencyConfig {

}
