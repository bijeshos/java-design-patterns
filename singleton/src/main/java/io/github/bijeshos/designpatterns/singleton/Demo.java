package io.github.bijeshos.designpatterns.singleton;

public class Demo {
    public static void main(String[] args) {
        CounterSingleton counter = CounterSingleton.INSTANCE;

        System.out.println("Value before incrementing: " + counter.getCurrentCount());
        counter.incrementBy(1000);
        System.out.println("Value after first increment: " + counter.getCurrentCount());
        counter.incrementBy(1000);
        System.out.println("Value after second increment: " + counter.getCurrentCount());
    }
}
