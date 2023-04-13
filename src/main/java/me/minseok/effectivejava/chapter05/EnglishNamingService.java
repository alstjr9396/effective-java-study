package me.minseok.effectivejava.chapter05;

public class EnglishNamingService implements NamingService {

    @Override
    public int getLength(String name) {
        return name.length() + 2;
    }

    public boolean isEnglishName(String name) {
        return "English".equals(name);
    }
}
