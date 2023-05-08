package me.minseok.effectivejava.chapter13;

import java.util.*;

public class Stack implements Cloneable{

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size ==0;
    }

    // 가변 상태를 참조하는 클래스용 clone 메서드
    @Override public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            // 아래 코드가 없을 경우 원본과 클론이 동일한 배열을 참조
            // 하지만, deep copy가 아니라서 위험한 코드
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // 원소를 위한 공간을 적어도 하나 이상 확보한다.
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    // clone이 동작하는 모습을 보려면 명령줄 인수를 몇 개 덧붙여서 호출해야 한다.
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (String arg : args)
            stack.push(arg);
        Stack copy = stack.clone();

        System.out.println(stack.elements[0] == copy.elements[0]);

        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        while (!copy.isEmpty())
            System.out.print(copy.pop() + " ");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("minseok");
        hashSet.add("kang");
        System.out.println("HashSet: " + hashSet);

        /*
            보통 clone으로 복사하지 않고
            생성자나 복사 전용 팩터리 메서드를 생성
         */
        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet: " + treeSet);

        // TreeSet: nature order 순으로 정렬, 기본 오름차순
        TreeSet<PhoneNumber> numbers = new TreeSet<>(Comparator.comparingInt(PhoneNumber::hashCode));

        // 동기화 적용, 속도는 느림
        Set<PhoneNumber> phoneNumbers = Collections.synchronizedSet(numbers);

    }
}
