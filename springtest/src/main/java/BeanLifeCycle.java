import beanfactory.MyBeanPostProcessor;
import beanfactory.MyInstantiationAwareBeanPostProcessor;
import org.apache.commons.lang.StringUtils;
import model.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import javax.sound.midi.Soundbank;

public class BeanLifeCycle {

    private static void LifeCycleBeanFactory(){
        String path="G:\\Workspace\\idea-test\\myDesignPattern\\springtest\\src\\main\\resources\\" +
                "com\\beans.xml";
        Resource re = new FileSystemResource(path);

        BeanFactory xmlBeanFactory = new XmlBeanFactory(re);
        ((ConfigurableBeanFactory)xmlBeanFactory).addBeanPostProcessor(new MyBeanPostProcessor());
        ((ConfigurableBeanFactory)xmlBeanFactory).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        Car car = (Car) xmlBeanFactory.getBean("car");
        car.introduce();
        car.setColor("红色");

        Car car1 = (Car) xmlBeanFactory.getBean("car");
        System.out.println("car == car1:"+(car==car1));
        ((XmlBeanFactory)xmlBeanFactory).destroySingletons();
    }

    public  static void  testApplication(){
        String path="G:\\Workspace\\idea-test\\myDesignPattern\\springtest\\src\\main\\resources\\" +
                "com\\beans.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(path);
        Car car = (Car) context.getBean("car");
        car.introduce();
        car.setColor("红色");

        Car car1 = (Car) context.getBean("car");
        System.out.println("car == car1:"+(car==car1));
        ((FileSystemXmlApplicationContext) context).destroy();
    }


    public static void main(String[] args) {

//        LifeCycleBeanFactory();
//        testApplication();

        int x=21;
        int y=16;
//        x=x+y;
//        y=x-y;
//        x=x-y;
        System.out.println(x+","+y);
        System.out.println(x&(y-1));
        System.out.println(isDuichen(123454321));
        System.out.println(isDuichen(123454322));
    }

    private static boolean isDuichen(int a){
        String aStr = String.valueOf(a);
        String end=null;
        String strat=null;

        if (aStr.length()%2==0) {
            end = aStr.substring(aStr.length() / 2, aStr.length());
            strat = aStr.substring(0, aStr.length() / 2);
        }else {
            end = aStr.substring(aStr.length() / 2+1, aStr.length());
            strat = aStr.substring(0, aStr.length() / 2);
        }

        String newend = StringUtils.reverse(end);
        System.out.println(strat);
        System.out.println(newend);

        if (strat.equalsIgnoreCase(newend)){
            return true;
        }

        return false;
    }

}
