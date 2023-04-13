package me.minseok.effectivejava.chapter05;

public class NamingUtils {

    // 유연성이 떨어지는 코드. If want to use EnglishNamingService...
    private static final KoreanNamingService koreanNamingService = new KoreanNamingService();

    private NamingUtils() {}

    public static boolean isValid(String name) {
        // 재사용성이 떨어지는 코드. If want to use EnglishNamingService, have to use isEnglishName()...
        return koreanNamingService.isKoreanName(name);
    }
}
