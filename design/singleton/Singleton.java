package singleton;

/**
 * @Author xuchuanwei
 * @Mail 1141811203@qq.com
 * @Time 2020/6/24 14:25
 * 设计模式-单例模式
 **/
public class Singleton {

    public static void main(String[] args) {
        System.out.println(SingletonTest1.getSingleton().getName());
        System.out.println(SingletonTest2.getSingleton().getName());
    }

    /**
     * 饿汉式
     */
    static class SingletonTest1 {
        private static SingletonTest1 singleton = new SingletonTest1();

        private String name = "饿汉式";

        public String getName() {
            return name;
        }

        public static SingletonTest1 getSingleton() {
            return singleton;
        }
    }

    /**
     * 懒汉式
     */
    static class SingletonTest2 {
        private static SingletonTest2 singleton;
        private String name = "懒汉式";

        public String getName() {
            return name;
        }

        public static SingletonTest2 getSingleton() {
            if (singleton == null) {
                synchronized (SingletonTest2.class) {
                    if (singleton == null) {
                        singleton = new SingletonTest2();
                    }
                }
            }
            return singleton;
        }
    }
}
