package io.github.bijeshos.designpatterns.factorymethod;

public class ToyBusMaker implements ToyMaker {
    @Override
    public Toy makeToy(ToyColor color) {
        return new ToyBus(color);
    }
}
