package me.minseok.effectivejava.chapter21.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {
        // List.of() 리스트는 불변 따라서 수정 하려고 하면 UnsupportedOperationException 발생
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // 이터레이터로 콜렉션을 순회하는 중에 Collection의 remove를 사용한다면 ConcurrentModificationException 발생
//        for (Integer number : numbers) {
//            if (number == 3) {
//                numbers.remove(number);
//            }
//        }

        // 이터레이터의 remove 사용하기
//        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
//            Integer integer = iterator.next();
//            if(integer == 3) {
//                iterator.remove();
//            }
//        }

//        // 인덱스 사용하기
//        for (int i = 0; i < numbers.size() ; i++) {
//            if (numbers.get(i) == 3) {
//                numbers.remove(numbers.get(i));
//            }
//        }

        // removeIf 사용하기
        // 이터레이터의 remove 사용하는것과 같다
        numbers.removeIf(number -> number == 3);

        // 출력
        numbers.forEach(System.out::println);
    }
}
