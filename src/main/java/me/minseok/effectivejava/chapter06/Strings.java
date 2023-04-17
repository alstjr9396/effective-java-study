package me.minseok.effectivejava.chapter06;

public class Strings {

    public static void main(String[] args) {
        String hello = "hello";

        // 같은 객체의 인스턴스를 생성해 불필요하게 메모리를 사용한다.
        String hello2 = new String("hello");

        String hello3 = "hello";

        System.out.println(hello == hello2);
        System.out.println(hello.equals(hello2));
        System.out.println(hello == hello3);
        System.out.println(hello.equals(hello3));
    }
}
