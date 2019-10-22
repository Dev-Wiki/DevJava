package net.devwiki.pattern.singleinstance;

public class HungryInstance {

    private static HungryInstance instance = new HungryInstance();

    private HungryInstance() {
    }

    public static HungryInstance getInstance() {
        return instance;
    }

    public void info() {
        System.out.println("I am HungryInstance!");
    }

}
