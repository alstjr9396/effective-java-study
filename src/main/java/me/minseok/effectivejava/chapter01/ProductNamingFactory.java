package me.minseok.effectivejava.chapter01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * 이 클래스는 NamingSerivce 인터페이스의 구현체 인스턴스를 반환한다.
 * @see NamingSerivce
 */
public class ProductNamingFactory {

    public static NamingSerivce of(String lang) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (lang.equals("ko")) {
//            return new KoreanNamingSerivce();
            Class<?> aClass = Class.forName("me.minseok.effectivejava.chapter01.KoreanNamingSerivce");
            Constructor<?> constructor = aClass.getConstructor();
            NamingSerivce namingSerivce = (NamingSerivce) constructor.newInstance();
            namingSerivce.getMaxNameSize();
            return namingSerivce;
        } else {
            Class<?> aClass = EnglishNamingSerivce.class;
            long count = Arrays.stream(aClass.getDeclaredMethods())
                    .filter(method -> method.isAnnotationPresent(TestNaming.class))
                    .count();

            Constructor<?> constructor = aClass.getConstructor();
            return (EnglishNamingSerivce) constructor.newInstance();
        }
    }
}
