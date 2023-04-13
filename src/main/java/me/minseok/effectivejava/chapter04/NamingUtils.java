package me.minseok.effectivejava.chapter04;

public class NamingUtils {

    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     */
    private NamingUtils() {
        throw new AssertionError();
    }

    public static String getRandomName() {
        return "random";
    }
}
