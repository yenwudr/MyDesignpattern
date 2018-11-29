package beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor extends
        InstantiationAwareBeanPostProcessorAdapter {

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if ("car".equals(beanName)) {
            System.out.println("调用MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation().  ");

        }

        return null;
    }


    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            System.out.println("调用MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation().  ");

        }
        return true;
    }

    public PropertyValues postProcessPropertyValues(
            PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if ("car".equals(beanName)) {
            System.out.println("调用MyInstantiationAwareBeanPostProcessor.postProcessPropertyValues().  "+pds);
//            for (int i=0;i<=pds.length;i++){}
        }
        return pvs;
    }
}
