package me.minseok.effectivejava.chapter03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void perform() {
        /*
            Concert를 테스트할 경우 주목적이 아닌 싱글턴 인스턴스를 불필요하게 참조할 필요없다.
            인터페이스를 사용할 경우 가짜 객체로 대체 가능하다.
         */
        Concert concert = new Concert(new MockElvis());
        concert.perform();

        assertTrue(concert.isLightsOn());
        assertTrue(concert.isMainStateOpen());
    }


}