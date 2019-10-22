package net.devwiki.pattern.singleinstance;

public class SyncMethodInstance {

    private static SyncMethodInstance instance = null;

    private SyncMethodInstance() {
    }

    public synchronized static SyncMethodInstance getInstance() {
        if (instance == null) {
            instance = new SyncMethodInstance();
        }
        return instance;
    }

    public void info() {
        System.out.println("I am SyncMethodInstance!");
    }
}
