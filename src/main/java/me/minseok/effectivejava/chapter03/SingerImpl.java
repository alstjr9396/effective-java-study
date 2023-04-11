package me.minseok.effectivejava.chapter03;


public class SingerImpl implements Singer {

    private static final SingerImpl INSTANCE = new SingerImpl();

    private static String level = "pro";

    private SingerImpl() {}

    public static SingerImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public void sing() {
        System.out.println("Hello!");
    }

    public String getLevel() {
        return level;
    }

    public static void sayName(String name) {
        System.out.println(name);
    }

    public static boolean isPro(SingerImpl singer) {
        return singer.getLevel().equals("pro");
    }
}
