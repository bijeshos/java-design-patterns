package io.github.bijeshos.designpatterns.factorymethod;

public class ToyBus implements Toy {
    ToyColor toyColor;

    public ToyBus(ToyColor toyColor) {
        this.toyColor = toyColor;
    }

    @Override
    public void description() {
        System.out.println("Toy Bus Color : "+this.toyColor);
    }
}
