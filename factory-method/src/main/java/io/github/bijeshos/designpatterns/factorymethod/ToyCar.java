package io.github.bijeshos.designpatterns.factorymethod;

public class ToyCar implements Toy {
    ToyColor toyColor;

    public ToyCar(ToyColor toyColor) {
        this.toyColor = toyColor;
    }

    @Override
    public void description() {
        System.out.println("Toy Car Color: "+this.toyColor);
    }
}
