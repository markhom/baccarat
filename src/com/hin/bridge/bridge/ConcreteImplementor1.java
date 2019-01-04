package com.hin.bridge.bridge;

/**
 * @author chenjinfu
 * @since 2019/01/02
 */
public class ConcreteImplementor1 implements Implementor {

    @Override
    public void doSomthing() {
        System.out.println("具体实现化角色一doSomething");
    }

    @Override
    public void doAnything() {
        System.out.println("具体实现化角色一doAnything");
    }
}
