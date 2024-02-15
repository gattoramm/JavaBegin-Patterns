package Singleton;

public  class TestSingleton2 {
    private static final TestSingleton2 instance = new TestSingleton2();

    public static synchronized TestSingleton2 getInstance() {
        return instance;
    }

    private TestSingleton2() {
    }

    public void print() {
        System.out.println(this);
    }
}
