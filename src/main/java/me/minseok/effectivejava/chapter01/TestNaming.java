package me.minseok.effectivejava.chapter01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface TestNaming {
}
