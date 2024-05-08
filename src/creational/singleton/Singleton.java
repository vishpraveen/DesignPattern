package creational.singleton;

public class Singleton {
    private static Singleton INSTANCE = null;
    private int count = 0;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    void incrementCount() {
        count += 1;
    }

    void resetCount() {
        count = 0;
    }

    int getCount() {
        return count;
    }
}
