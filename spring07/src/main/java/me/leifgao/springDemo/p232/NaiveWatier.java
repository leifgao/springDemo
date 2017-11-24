package me.leifgao.springDemo.p232;

/**
 * Created by leif on 2017/9/10
 */
public class NaiveWatier implements Waiter{

    String name;

    @Override
    public void greetTo(String name) {
        System.out.println("greet to " + name);
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serve to " + name);
    }
}
