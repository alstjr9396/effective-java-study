package me.minseok.effectivejava.chapter20.multipleinheritance;

public class MyCat extends AbstractCat implements Flyable {

    // 새로운 기능을 위임할 인스턴스
    private MyFlyable myFlyable = new MyFlyable();

    @Override
    protected String sound() {
        return "인싸 고양이 두 마리가 나가신다!";
    }

    @Override
    protected String name() {
        return "유미";
    }

    public static void main(String[] args) {
        MyCat myCat = new MyCat();
        System.out.println(myCat.sound());
        System.out.println(myCat.name());

        // 확장된 기능을 제공하는 구현체에 위임
        myCat.fly();
    }

    @Override
    public void fly() {
        this.myFlyable.fly();
    }

    // 인터페이스와 추상 클래스가 제공하는 기능을 사용해서 기능을 추가할 수 있다.
    private class MyFlyable extends AbstractFlyable {
        @Override
        public void fly() {
            System.out.println("날아라.");
        }
    }
}
