package me.minseok.effectivejava.chapter01;

/**
 * 자바 9부터 private 정적 메서드를 가질 수 있다.
 * 모든 구현체가 해당 메소드를 정의할 필요가 없다.(강제성이 없다.)
 */
public interface NamingSerivce {

    public String naming();

    static private void prepareMessage() {}

    static public String randomNaming() {
        prepareMessage();
        return "randomName";
    }

    static public String randomNumericNaming() {
        prepareMessage();
        return "randomNumbericName";
    }

    default int getMaxNameSize() {
        return 10;
    }
}
