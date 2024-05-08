package creational.singleton;

public class SingletonLazy {

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        return SingletonInstanceHolder.INSTANCE;
    }

    private static class SingletonInstanceHolder {
        static final SingletonLazy INSTANCE = new SingletonLazy();
    }
}
