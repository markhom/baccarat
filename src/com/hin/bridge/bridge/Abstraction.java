package com.hin.bridge.bridge;

/**
 * @author chenjinfu
 * @since 2019/01/03
 *
 * 分离抽象和实现部分，具有更好的扩展性
 */
public abstract class Abstraction {

    protected  Implementor implementor;

    public Abstraction(Implementor Implementor){
        this.implementor = Implementor;
    }

    public void operation(){
        implementor.doAnything();
        implementor.doSomthing();
    }
}
