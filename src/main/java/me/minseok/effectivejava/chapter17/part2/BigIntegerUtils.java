package me.minseok.effectivejava.chapter17.part2;

import java.math.BigInteger;

public class BigIntegerUtils {

    public static BigInteger safeInstance(BigInteger val) {
        // 상속이 허용되어 있는 불변 클래스의 하위 클래스들이 명확하지 않는다면 방어적인 복사를 사용해야 한다.
        return val.getClass() == BigInteger.class ? val : new BigInteger(val.toByteArray());
    }
}
