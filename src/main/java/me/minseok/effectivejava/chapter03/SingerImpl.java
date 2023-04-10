package me.minseok.effectivejava.chapter03;

public class SingerImpl implements Singer {

    private static final SingerImpl INSTANCE = new SingerImpl();

    private SingerImpl() {}

    public static SingerImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public void sing() {
        System.out.println("Hello!");
    }
}
