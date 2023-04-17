package me.minseok.effectivejava.chapter06;

import java.util.regex.Pattern;

public class RomanNumerals {

    /**
     * @deprecated in favor of
     * {@link #isRomanNumberalFast(String)}
     */
    @Deprecated(forRemoval = true, since = "1.1")
    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // 값비싼 객체를 재사용해 성능을 개선한다.
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumberalFast(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        boolean result = false;


        result = isRomanNumeralSlow("MCMLXXXVI");
        System.out.println(result);

        result = isRomanNumberalFast("MCMLXXXVI");
        System.out.println(result);
    }
}
