package io.github.bijeshos.designpatterns.singleton;

public class Demo {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.INSTANCE;

        System.out.println("Value before changing: " + mySingleton.getValue());
        mySingleton.setValue(1000);
        System.out.println("Value after changing: " + mySingleton.getValue());
    }
}
