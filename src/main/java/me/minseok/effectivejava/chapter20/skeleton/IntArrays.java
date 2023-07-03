package me.minseok.effectivejava.chapter20.skeleton;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

// 골격 구현을 사용해 완성한 구체 클래스
public class IntArrays {
    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);

        // 골격 역활을 하는 추상클래스를 통해서 구현한다면 일부부만 재정의 할 수 있다.
        return new AbstractList<>() {
            @Override public Integer get(int i) {
                return a[i];
            }

            @Override public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val;     // 오토언박싱
                return oldVal;  // 오토박싱
            }

            @Override public int size() {
                return a.length;
            }
        };
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = i;

        List<Integer> list = intArrayAsList(a);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
