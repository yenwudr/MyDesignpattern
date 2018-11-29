package proxy.yun;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

//生成代理对象的代码
public class YunProxy {

    public YunInvocationHandle h;

    public YunProxy(YunInvocationHandle h){
        this.h=h;
    }

    private static  String ln="\r\n";

    public static Object newProxyInstance(YunClassLoader loader,
                                          Class<?>[] interfaces,
                                          YunInvocationHandle h)
            throws IllegalArgumentException{

        FileWriter fw=null;
        try {
            //1、生成源代码
            String s = generateStrc(interfaces[0]);

            //2、将生成的源代码输出到磁盘，保存为.java 文件
            String filePath = YunProxy.class.getResource("").getPath();
            File file = new File(filePath+"$MyProxy.java");
             fw = new FileWriter(file);
            fw.write(s);
            fw.flush();
            //3、编译源代码，并且生成。calss文件
            //4、将class文件中的内容动态加载到JVM中
            //5、返回被代理后的代理对象
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;

    }

    private static String generateStrc(Class inerface){
        StringBuffer sbu = new StringBuffer();
        sbu.append("package proxy.yun;"+ln);
        sbu.append("import java.lang.reflect.Method; "+ln);
        sbu.append(" public class $MyProxy extends YunProxy implements "+inerface.getName()+"{"+ln);
        sbu.append(" public $MyProxy(YunInvocationHandle hh){"+ln);
        sbu.append(" super(hh);"+ln);
        sbu.append(" }"+ln);
        for (Method method:inerface.getMethods()){

            sbu.append(" public "+method.getReturnType()+"  "+ method.getName()+"{"+ln);
            sbu.append(" Method m =  "+inerface.getName()+".class.getMethod(\""+ method.getName()+"\",new class[]{});"+ln);
            sbu.append(" this.h.invoke(this,m,null)"+ln);
            sbu.append(" }"+ln);

        }



        sbu.append("}");
        return sbu.toString();
    }
}
