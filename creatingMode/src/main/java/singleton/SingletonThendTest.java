package singleton;

public class SingletonThendTest {

    private static class SingletonThend implements  Runnable{
        public void run() {
            Singleton3.getInstance();
        }
    }

    public static void main(String[] args) {

//        for (int i=0;i<1000;i++){
//            final  Thread thread= new Thread(new SingletonThend());
//            thread.setName("thread_"+i);
//            thread.start();
//        }

        for (int i=1;i<10;i++){
            Singleton5 instance = Singleton5.INSTANCE;
            System.out.println(instance.hashCode());
            instance.whateverMethod();
        }
    }

}
