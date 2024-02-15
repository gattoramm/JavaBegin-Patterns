package Singleton;

public class TestSingleton {
    public static TestSingleton instance;

    public static synchronized TestSingleton getInstance() {
        if (instance == null)
            instance = new TestSingleton();
        return instance;
    }

    private TestSingleton() {
    }

    public void print() {
        System.out.println(this);
    }
}
