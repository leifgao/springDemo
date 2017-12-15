package me.leifgao.springDemo.p275;

/**
 * Created by leif on 2017/11/28
 */

public interface Waiter {
    void greetTo(String name);
    void serveTo(String name);
    void argsTest(Waiter waiter);
    void atArgsTest(Waiter waiter);
}
