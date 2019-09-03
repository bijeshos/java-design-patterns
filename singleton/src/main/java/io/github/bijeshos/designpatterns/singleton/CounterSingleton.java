package io.github.bijeshos.designpatterns.singleton;

public enum CounterSingleton {

    INSTANCE;

    int count;

    public int getCurrentCount() {
        return count;
    }

    public void incrementBy(int increment) {
        this.count = this.count + increment;
    }
}
