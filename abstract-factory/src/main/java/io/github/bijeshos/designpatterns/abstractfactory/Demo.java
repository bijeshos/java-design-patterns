package io.github.bijeshos.designpatterns.abstractfactory;

public class Demo {
    private Hall hall;
    private Bedroom bedroom;
    private Kitchen kitchen;


    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("Building Indian Home");
        demo.createHome(HomeMaker.makeFactory(HomeType.INDIAN));
        demo.getHall().description();
        demo.getBedroom().description();
        demo.getKitchen().description();

        System.out.println("Building American Home");
        demo.createHome(HomeMaker.makeFactory(HomeType.AMERICAN));
        demo.getHall().description();
        demo.getBedroom().description();
        demo.getKitchen().description();

        System.out.println("Building European Home");
        demo.createHome(HomeMaker.makeFactory(HomeType.EUROPEAN));
        demo.getHall().description();
        demo.getBedroom().description();
        demo.getKitchen().description();

    }

    public void createHome(final HomeFactory factory) {
        setBedroom(factory.buildBedroom());
        setHall(factory.buildHall());
        setKitchen(factory.buildKitchen());
    }


    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}
