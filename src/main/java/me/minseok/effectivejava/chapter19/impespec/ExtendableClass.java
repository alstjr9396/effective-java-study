package me.minseok.effectivejava.chapter19.impespec;

/**
 * Example class for java documentation for extendable class
 */
public class ExtendableClass {

    /**
     * This method can be overridden to print any message.
     *
     * @implSpec
     * Please use System.out.println().
     */
    protected void doSomething() {
        // javadoc 생성 시 태그 치환 옵션 추가
        // 상속을 고려해서 문서화
        // -tag "implSpec:a:Implementation Requirements:"
        System.out.println("hello");
    }
}
