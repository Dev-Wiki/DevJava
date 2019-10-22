package net.devwiki.pattern.singleinstance;

public class InnerClassInstance {

    private static class InstanceHolder {
        private static final InnerClassInstance INSTANCE = new InnerClassInstance();
    }

    private InnerClassInstance() {

    }

    public static InnerClassInstance getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public void info() {
        System.out.println("I am InnerClassInstance!");
    }
}
