package com.hin.bridge.bridge;

/**
 * @author chenjinfu
 * @since 2019/01/03
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor Implementor) {
        super(Implementor);
    }

    public void otherOperation(){
        System.out.println("其他处理=====");
    }

}
