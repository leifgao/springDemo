package me.leifgao.springDemo.p275;

/**
 * Created by leif on 2017/11/28
 */
public class NaiveWatier implements Waiter{
    @Override
    public void greetTo(String name) {
        System.out.println("greet to " + name);
    }

    @leif
    @Override
    public void serveTo(String name) {
        System.out.println("serve to " + name);
    }

    public void argsTest(Waiter waiter) {
        System.out.println( null instanceof  Waiter);
        System.out.println("argsTest : ");
    }


    @Override
    public void atArgsTest(Waiter waiter) {
        System.out.println("@args() 你好 " );
    }

}
