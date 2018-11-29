package proxy.yun
import java.lang.reflect.Method 
 public class $MyProxy extends YunProxy implements proxy.jdk.Person{
 public $MyProxy(YunInvocationHandle hh){
 super(hh);
 }
 public void  findHouse{
 Method m =  proxy.jdk.Person.class.getMethod("findHouse",new class[]{});
 this.h.invoke(this,m,null)
 }
}