package com.codestates.section2week4.singleton;

import com.codestates.section2week4.SingletonTest;

public class SingletonService {
    
    //1. static 영역에 객체 하나만 생성
    private static final SingletonService instance = new SingletonService();
    
    //2. 위에서 만든 instance 가 필요하면 아래 매서드를 통햇만 조회할 수 있도록 함.
    //그럼 getInstance() 사용하면 항상! 하나의 인스턴스만 나올 수 있음
    public static SingletonService getInstance(){
        return instance;
    }
    
    //3. 생성자 private, 외부에서 new 키워드로 객체생성 불가하게 만들기. only getInstance() 매서드 통해서만
    private SingletonService() {}
}
