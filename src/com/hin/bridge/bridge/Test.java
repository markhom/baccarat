package com.hin.bridge.bridge;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author chenjinfu
 * @since 2019/01/03
 */
public class Test {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementor1());
        Abstraction abstraction2 = new RefinedAbstraction(new ConcreteImplementor2());

        abstraction.operation();
        abstraction2.operation();
        String a = new String("abc");
        String b = new String("abc");
        int d =3;
        int f =3;
        System.out.println(a.equals(b)+"==="+(a==b));

    }
}
