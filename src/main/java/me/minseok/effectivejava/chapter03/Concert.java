package me.minseok.effectivejava.chapter03;

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
        concert.start(SingerImpl::getInstance);
    }
}
