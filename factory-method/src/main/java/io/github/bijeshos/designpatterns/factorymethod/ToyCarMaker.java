package io.github.bijeshos.designpatterns.factorymethod;

public class ToyCarMaker implements  ToyMaker {
    @Override
    public Toy makeToy(ToyColor color) {
        return new ToyCar(color);
    }
}
