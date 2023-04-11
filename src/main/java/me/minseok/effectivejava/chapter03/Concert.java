package me.minseok.effectivejava.chapter03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Concert {

    private boolean lightsOn;

    private boolean mainStateOpen;

    private IElvis elvis;

    public Concert(IElvis elvis) {
        this.elvis = elvis;
    }

    public void perform() {
        mainStateOpen = true;
        lightsOn = true;
        elvis.sing();
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public boolean isMainStateOpen() {
        return mainStateOpen;
    }

    // 정적 팩터리의 메서드 참조를 공급자(Supplier)로 사용할 수 있다.
    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sing();
    }

    public static void main(String[] args) {
        Concert concert = new Concert(Elvis.INSTANCE);

        // 메서드 참조: 메서드 하나만 호출하는 람다 표현식을 줄여쓰는 방법
        concert.start(() -> SingerImpl.getInstance());
        concert.start(SingerImpl::getInstance);

        // 함수형 인터페이스: 람다 표현식과 메서드 참조에 대한 타겟 타입을 제공

        // Output만 있는 함수형 인터페이스
        Supplier<Singer> singerSupplier = SingerImpl::getInstance;
        concert.start(singerSupplier);

        // Input과 Output이 있는 함수형 인터페이스
        Function<Singer, String> stringFunction = Object::toString;
        System.out.println(stringFunction);

        // Input만 잇는 함수형 인터페이스
        List<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Tom");
        Consumer<String> singerConsumer = SingerImpl::sayName;
        nameList.forEach(singerConsumer);

        // Output 타입이 boolean인 함수형 인터페이스
        List<SingerImpl> singerList = new ArrayList<>();
        singerList.add(SingerImpl.getInstance());
        singerList.add(SingerImpl.getInstance());
        Predicate<SingerImpl> singerPredicate = SingerImpl::isPro;
        System.out.println(singerList.stream().filter(singerPredicate).count());

    }
}
