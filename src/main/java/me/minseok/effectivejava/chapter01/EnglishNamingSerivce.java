package me.minseok.effectivejava.chapter01;

public class EnglishNamingSerivce implements NamingSerivce {
    @Override
    public String naming() {
        return "English";
    }

    @TestNaming
    public String test1() {
        return "test1";
    }

    public String test2() {
        return "test2";
    }
}
