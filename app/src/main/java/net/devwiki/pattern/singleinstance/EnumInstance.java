package net.devwiki.pattern.singleinstance;

enum EnumInstance {

    INSTANCE;

    private EnumInstance() {}

    public void info() {
        System.out.println("I am EnumInstance!");
    }
}
