package proxy.jdk;

public class User implements Person {
    @Override
    public void findHouse() {
        System.out.println("环境舒适");
        System.out.println("交通方便");
        System.out.println("价格便宜");
    }
}
