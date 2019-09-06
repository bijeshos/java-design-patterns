package io.github.bijeshos.designpatterns.abstractfactory.european;

import io.github.bijeshos.designpatterns.abstractfactory.Bedroom;
import io.github.bijeshos.designpatterns.abstractfactory.Hall;
import io.github.bijeshos.designpatterns.abstractfactory.HomeFactory;
import io.github.bijeshos.designpatterns.abstractfactory.Kitchen;

public class EuropeanHomeFactory implements HomeFactory {
    @Override
    public Hall buildHall() {
        return new EuropeanHall();
    }

    @Override
    public Bedroom buildBedroom() {
        return new EuropeanBedroom();
    }

    @Override
    public Kitchen buildKitchen() {
        return new EuropeanKitchen();
    }
}
