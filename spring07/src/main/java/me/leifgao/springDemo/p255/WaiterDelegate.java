package me.leifgao.springDemo.p255;

import me.leifgao.springDemo.p246.Waiter;

/**
 * Created by leif on 2017/9/11
 * 代理类
 */
public class WaiterDelegate {

    private Waiter waiter;

    public void service(String name) {
        waiter.greetTo(name);
        waiter.serveTo(name);
    }

    public void setWaiter(Waiter waiter) {
        this.waiter =  waiter;
    }

}
