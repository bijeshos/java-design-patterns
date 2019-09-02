package io.github.bijeshos.designpatterns.singleton;

public enum MySingleton {

    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
