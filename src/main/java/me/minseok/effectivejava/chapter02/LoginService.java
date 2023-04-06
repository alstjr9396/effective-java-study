package me.minseok.effectivejava.chapter02;

public class LoginService {

    public void login() {
        /*
            Case1: 생성자 체이닝 사용
            파라미터가 많아지면 어떤 값이 필요한지 어떤 필드에 저장되는지 확인하기 어렵다.
         */
        Member member = new Member("test", "loginId", "loginPwd");

        /*
            Case2: 자바빈즈 패턴 사용
            값 설정을 필요로하는 모든 필드가 설정되기 전에 사용될 가능성이 있다.
            어떤 필드를 설정해야 되는지 모호하다.
         */
        Member member2 = new Member();
        member2.setName("test2");

        /*
            Case3: Case1 + Case2
            필수 필드를 생성자로 강제성을 주고 선택적인 필드는 메서드를 통해 설정해도
            불변객체로 만들기 어렵다는 단점이 있다.
         */
        Member member3 = new Member("test3");
        member3.setEmail("email");

        /*
            Case4: 빌더 패턴 사용
            계층적으로 설계된 클래스와 함께 사용하기 좋다.
            점층적 생성자보다 코드를 읽고 쓰기가 간결하고 안전하다.

            빌더를 만들기 위해 필드가 중복되는 단점이 있다.
         */
        Member member4 = new Member.Builder("test4")
                .email("email")
                .build();
    }
}
