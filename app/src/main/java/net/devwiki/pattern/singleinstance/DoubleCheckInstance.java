package net.devwiki.pattern.singleinstance;

public class DoubleCheckInstance {

    private static DoubleCheckInstance instance;

    private DoubleCheckInstance() {

    }

    public static DoubleCheckInstance getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckInstance.class) {
                if (instance == null) {
                    instance = new DoubleCheckInstance();
                }
            }
        }
        return instance;
    }

    public void info() {
        System.out.println("I am DoubleCheckInstance!");
    }
}
