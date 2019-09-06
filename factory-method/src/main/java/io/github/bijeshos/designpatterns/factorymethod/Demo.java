package io.github.bijeshos.designpatterns.factorymethod;

public class Demo {

    private final ToyMaker toyMaker;

    public Demo(ToyMaker toyMaker) {
        this.toyMaker = toyMaker;
    }

    public static void main(String[] args) {
        Demo demo = new Demo(new ToyCarMaker());
        demo.buildToy();

        demo = new Demo(new ToyBusMaker());
        demo.buildToy();

    }

    public void buildToy() {
        Toy toy = toyMaker.makeToy(ToyColor.RED);
        toy.description();
        toy = toyMaker.makeToy(ToyColor.BLUE);
        toy.description();

    }
}
