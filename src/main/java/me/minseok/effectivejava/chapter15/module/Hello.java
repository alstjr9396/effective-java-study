package me.minseok.effectivejava.chapter15.module;

import me.minseok.name.NameService;

public class Hello {

    // 모듈을 모듈아닌 곳에서 사용하면 무의미하다.
    public static void main(String[] args) {
        NameService nameService = new NameService();
        /*
        * 모듈이 공개했는지 여부와 상관없이
        * public 클래스가 선언한 모든 public 혹은 protected 멤버를
        * 모듈 밖에서도 접근 할 수 있다.
        */
        System.out.println(nameService.getName());
    }
}
