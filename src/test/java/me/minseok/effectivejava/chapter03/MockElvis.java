package me.minseok.effectivejava.chapter03;

public class MockElvis implements IElvis{

    @Override
    public void leaveTheBuilding() {

    }

    @Override
    public void sing() {
        System.out.println("Test singing.");
    }
}
