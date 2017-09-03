package me.leifgao.springDemo.p113;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Iterator;

/**
 * Created by leif on 2017/9/3
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Iterator<String> beanNameIt =  beanFactory.getBeanNamesIterator();
        BeanDefinition carBeanDefinition = beanFactory.getBeanDefinition("car");
        while (beanNameIt.hasNext()) {
            System.out.println(beanNameIt.next());
        }
    }
}
