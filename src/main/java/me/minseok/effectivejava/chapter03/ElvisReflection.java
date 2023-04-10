package me.minseok.effectivejava.chapter03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {

    // 리플렉션을 통해 인스턴스를 생성하면 싱글턴을 보증하지 못한다.
    public static void main(String[] args) {
        try {
            // getConstructor: public 생성자만 접근 가능
            // getDeclaredConstructor: 선언되어 있는 생성자만 접근 가능
            Constructor<Elvis> defulatContConstructor = Elvis.class.getDeclaredConstructor();
            // 생성자의 접근 지시자가 private 이므로 접근 하기 위해 설정
            defulatContConstructor.setAccessible(true);
            Elvis elvis1 = defulatContConstructor.newInstance();
            Elvis elvis2 = defulatContConstructor.newInstance();
            System.out.println(elvis1 == elvis2);

        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
