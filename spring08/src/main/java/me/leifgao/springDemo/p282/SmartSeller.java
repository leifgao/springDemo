package me.leifgao.springDemo.p282;

/**
 * Created by leif on 2017/12/15
 */
public class SmartSeller implements Seller{
    @Override
    public void sell(String goods) {
        System.out.println("售卖" + goods);
    }
}
