package me.minseok.effectivejava.chapter03.enumType;

import me.minseok.effectivejava.chapter03.IElvis;

// 열거 타입 방식의 싱글턴
public enum Elvis implements IElvis {

    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Leaving the building.");
    }

    @Override
    public void sing() {
        System.out.println("Singing");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
