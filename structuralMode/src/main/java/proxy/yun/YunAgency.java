package proxy.yun;

import proxy.jdk.Person;

import java.lang.reflect.Method;

public class YunAgency implements YunInvocationHandle {

    private Person target;

    public Object getInstance(Person target){
        this.target = target;
        Class clazz = target.getClass();
        Object o = YunProxy.newProxyInstance(new YunClassLoader(),clazz.getInterfaces(),this);
        return o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }


}
