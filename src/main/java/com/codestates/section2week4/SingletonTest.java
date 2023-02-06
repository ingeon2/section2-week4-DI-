package com.codestates.section2week4;

import com.codestates.section2week4.member.MemberService;
import com.codestates.section2week4.singleton.SingletonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest { //싱글톤이란 빈과 컨테이너의 수명이 같은것을 의미(단 하나만 생성해서 컨테이너 사라질때 같이 없에니)
                             //빈의 수명을 빈 스코프라고 함.

    //1. 그냥 생성 그냥 singletone
    //static DependencyConfig dependencyConfig = new DependencyConfig();

    //static MemberService memberService1 = dependencyConfig.memberService();
    //static MemberService memberService2 = dependencyConfig.memberService();

    /*public static void main(String[] args){
        System.out.println("memberService1 : " + memberService1);
        System.out.println("memberService2 : " + memberService2);
        //결과는 같은 MemberService 객체지만 주소값은 다름.
        //많은 객체가 생성되게 된다면 메모리 낭비, 효율성 문제 생김
        //그래서 싱글톤을 사용함. → singleton 패키지로 가자
    }*/



    //2. singleton 생성 (in java)
    /*static SingletonService singletonService1 = SingletonService.getInstance();
    static SingletonService singletonService2 = SingletonService.getInstance();

    public static void main(String[] args){
        System.out.println("singletonService1 : " + singletonService1);
        System.out.println("singletonService2 : " + singletonService2);
        //둘다 instane 객체니까 같은 주소값이 나옴
    }
    */

    //3. singleton in Spring
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);

    static MemberService memberService1 = ac.getBean("memberService", MemberService.class);
    static MemberService memberService2 = ac.getBean("memberService", MemberService.class);

    public static void main(String[] args){
        System.out.println("memberService1 : " + memberService1);
        System.out.println("memberService2 : " + memberService2);
        //둘다 spring 컨테이너가 singleton 이니까 주소값 같음
    }
}
