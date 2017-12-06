package me.leifgao.springDemo.p275;

/**
 * Created by leif on 2017/11/28
 */
public class NaiveWatier implements Waiter{
    @leif
    @Override
    public void greetTo(String name) {
        System.out.println("greet to " + name);
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serve to " + name);
    }

    public void argsTest(Waiter waiter) {
        System.out.println("函数入参是waiter");
    }
}
