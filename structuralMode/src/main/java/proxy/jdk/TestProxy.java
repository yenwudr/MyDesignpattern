package proxy.jdk;

import proxy.yun.YunAgency;
import sun.misc.ProxyGenerator;

import java.io.*;

public class TestProxy {

    public static void main(String[] args) {
//        Person instance =(Person) new Agency().getInstance(new User());
//
//        System.out.println(instance.getClass());
//        instance.findHouse();

        Person instance =(Person) new YunAgency().getInstance(new User());
//        instance.findHouse();

//        instance.getClass().getName().getClass().getMethod()

        /**
         * 原理
         * 1、获取被代理对象的对象，然后获取对象的接口
         * 2、JDK重新生成一个类，并且实现被代理对象所实现的接口
         * 3、把别带了对象的引用也获取到
         * 4、重新动态生成一个class字节码
         * 5、重新编译
         */
//        byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{ Person.class});
//
//        try {
//            FileOutputStream out = new FileOutputStream("G:\\proxy.class");
//            out.write(data);
//            out.flush();
//            out.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
