package me.minseok.effectivejava.chapter01;

/**
 * 특전한 변수가 가질 수 있는 값을 제한
 * 타입-세이프티를 보장할 수 있다.
 */
public enum OrderStatus {

    PREPARING(0), DELIVERING(1), DELIVERED(2);

    private int orderStatusCode;

    OrderStatus(int orderStatusCode) {
        orderStatusCode = orderStatusCode;
    }
}
