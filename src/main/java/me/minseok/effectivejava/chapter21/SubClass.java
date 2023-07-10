package me.minseok.effectivejava.chapter21;

public class SubClass extends SuperClass implements MarkerInterface {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        // 디폴트 메서드는 기존 구현체에 런라임 오류를 일으킬 수 있다.
        // MarkerInterface 때문에 컴파일 에러가 아닌 런타임 에러가 발생한다.
        // 클래스가 인터페이스를 이긴다는 규칙으로 SuperClass의 메서드를 먼저 찾아서 호출하려고 한다.
        subClass.hello();
    }

}
