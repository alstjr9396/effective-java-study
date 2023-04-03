package me.minseok.effectivejava.chapter01;

/**
 * 이 클래스는 NamingSerivce 인터페이스의 구현체 인스턴스를 반환한다.
 * @see NamingSerivce
 */
public class ProductNamingFactory {

    public static NamingSerivce of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanNamingSerivce();
        } else {
            return new EnglishNamingSerivce();
        }
    }
}
