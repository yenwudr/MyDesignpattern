package model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;


public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean {
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car(){
        System.out.println("调用car()构造函数");
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性！brand："+brand);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void introduce() {
        System.out.println("brand:"+brand+";colot:"+color+";maxSpeed:"+maxSpeed);
    }

    //BeanFactoryAware接口方法
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("调用BeanFactoryAware.setBeanFactory().  "+beanFactory);
        this.beanFactory=beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("调用BeanNameAware.setBeanName().  "+name);
        this.beanName=name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destroy().  ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet().  ");
    }

    public  void  myInit(){
        System.out.println("调用init-method所指的myInit().将maxSpeed设置为240  ");
        this.maxSpeed=240;
    }

    public  void  myDestory(){
        System.out.println("调用destory-method所指的myDestory().  ");
    }
}
