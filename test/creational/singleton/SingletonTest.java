package creational.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    private static Singleton instance;

    @BeforeAll
    static void Setup() {
        assertNull(instance);
        instance = Singleton.getInstance();
        assertNotNull(instance);
    }

    @Test
    void TestSingletonInstance() {
        assertSame(Singleton.getInstance(), instance);
    }

    @Test
    void TestIncrementingCountWithThread() {
        try {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        instance.incrementCount();
                    }
                }
            });
            t.start();
            t.join();
            assertEquals(10, instance.getCount());
        } catch (InterruptedException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Test
    void TestIncrementingCountWithMultipleThreads() {
        instance.resetCount();
        try {
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    instance.incrementCount();
                }
            });
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    instance.incrementCount();
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        assertEquals(20, instance.getCount());
    }
}