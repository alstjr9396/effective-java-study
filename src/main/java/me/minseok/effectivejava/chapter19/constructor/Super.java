package me.minseok.effectivejava.chapter19.constructor;

// 생성자에서 재정의 가능 메서드를 호출하면 안된다.
public class Super {
    // 잘못된 예 - 생성자가 재정의 가능 메서드를 호출한다.
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
    }
}
