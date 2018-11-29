package proxy.yun;

import java.lang.reflect.Method;

public interface YunInvocationHandle {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
