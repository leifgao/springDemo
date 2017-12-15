package me.leifgao.springDemo.p282;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by leif on 2017/12/15
 */
@Aspect
public class EnableSellerAspect {

    @DeclareParents(value = "me.leifgao.springDemo.p275.NaiveWatier", defaultImpl = SmartSeller.class)
    public Seller seller;

}
