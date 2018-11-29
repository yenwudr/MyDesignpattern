package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Agency implements InvocationHandler {

    private Person target;

    public Object getInstance(Person target){
        this.target = target;
        Class clazz = target.getClass();
        Object o = Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始找房");
        method.invoke(target,args);
        System.out.println("找房结束");
        return null;
    }
}
