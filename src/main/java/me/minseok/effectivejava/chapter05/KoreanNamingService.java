package me.minseok.effectivejava.chapter05;

public class KoreanNamingService implements NamingService{

    @Override
    public int getLength(String name) {
        return name.length() + 1;
    }

    public boolean isKoreanName(String name) {
        return "한글".equals(name);
    }
}
