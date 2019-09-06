package io.github.bijeshos.designpatterns.abstractfactory;

public interface HomeFactory {
    Hall buildHall();
    Bedroom buildBedroom();
    Kitchen buildKitchen();

}
