package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonLazyTest {

    @Test
    void TestSingletonLazyInstance() {
        SingletonLazy instance = SingletonLazy.getInstance();
        assertSame(SingletonLazy.getInstance(), instance);
    }
}