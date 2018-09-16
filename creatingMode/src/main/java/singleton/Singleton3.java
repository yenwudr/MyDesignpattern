package singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 *
 * JDK 版本：JDK1.5 起
 *
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 *  关键 instance对象使用了volatile 修饰，使得内存可见
 *
 *  不使用volatile时可能出现的问题
 *  1、threan_1进入#1时，这是子线程的instance为空，thread_1让出cpu资源给thread_2
 *  2、threan_2进入#1时，这是子线程的instance为空，thread_2让出cpu资源给thread_1
 *  3、threan_1依次执行#2、#3、#4、#5.1，最终在threan_1中实例化instance,thread_1让出cpu资源给thread_2
 *  4、threan_2从#1继续往下跑跑到#3，由于#1里面拿到的instance还是空（并没有及时从thread_1里面拿到最新的），所以thread_2仍然会执行#4，#5.1
 *  5、最后在threan_1和threan_2都实例化了instance
 *
 */
public class Singleton3 {
    private volatile static Singleton3 instance=null;
    private Singleton3(){}

    public static Singleton3 getInstance(){
        if (instance==null){ //#1
            synchronized (Singleton3.class){//#2
                if (instance==null){ //#3
                    instance = new Singleton3();//#4
                    System.out.println(Thread.currentThread().getName() + ": uniqueInstance is initalized..."); //#5.1
                }else{
                    System.out.println(Thread.currentThread().getName() + ": uniqueInstance is not initalized..."); //#5.2
                }
            }
        }
        return instance;
    }
}
