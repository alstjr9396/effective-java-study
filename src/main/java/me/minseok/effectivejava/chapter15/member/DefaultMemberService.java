package me.minseok.effectivejava.chapter15.member;

import java.util.Arrays;

/*
    Member를 위한 서비스 인터페이스 구현체 DefaultMemberService는
    다른 패키지에서 사용되지 않으므로 public 접근 제어자를 가질 필요가 없다.
    Member package-private 접근 제어자로 충분하다.
*/
class DefaultMemberService implements MemberService {

    private String name;

    // PrivateStaticClass는 DefaultMemberService에서만 사용함
    // PrivateStaticClass에서 DefaultMemberService을 사용하지 않음
    // 따라서 private static으로 중첩 시킴
    private static class PrivateStaticClass {
        // 외부 인스턴스를 참조하지 않음
        void doPrint() {
            // 불가능
            //System.out.println(name);
        }
    }

    private class PrivateClass {
        // 외부 인스턴스를 참조하는 필드가 자동으로 생성
        void doPrint() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
    }

}
