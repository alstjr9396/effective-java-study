package me.minseok.effectivejava.chapter20.defaultmethod;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface TimeClient {

    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                        int hour, int minute, int second);

    /*
        인터페이스가 공개되어있으면
        모든 구현체에 이 메소드를 구현해야만 한다.
     */
    LocalDateTime getLocalDateTime();

    /*
        static 메서드를 사용하면
        모든 구현체에서 이 메소드를 구현할 필요없다.
     */
    static ZoneId getZonedId(String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString + "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }

    /*
       디폴트 메서드를 사용하면
       모든 구현체에서 이 메소드를 구현할 필요없다.

       다만, 인스턴스 필드를 사용해야되는 경우 불가능하다. (추상 골격 클래스 사용)
    */
    default ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDateTime(), getZonedId(zoneString));
    }

}
