package net.devwiki.pattern.singleinstance;

public class SingleInstance {

    public static void main(String[] args) {
        EnumInstance.INSTANCE.info();
        InnerClassInstance.getInstance().info();
        DoubleCheckInstance.getInstance().info();
        HungryInstance.getInstance().info();
        SyncMethodInstance.getInstance().info();
    }
}
