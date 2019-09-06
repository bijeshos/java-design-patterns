package io.github.bijeshos.designpatterns.abstractfactory.american;

import io.github.bijeshos.designpatterns.abstractfactory.Bedroom;
import io.github.bijeshos.designpatterns.abstractfactory.Hall;
import io.github.bijeshos.designpatterns.abstractfactory.HomeFactory;
import io.github.bijeshos.designpatterns.abstractfactory.Kitchen;

public class AmericanHomeFactory implements HomeFactory {
    @Override
    public Hall buildHall() {
        return new AmericanHall();
    }

    @Override
    public Bedroom buildBedroom() {
        return new AmericanBedroom();
    }

    @Override
    public Kitchen buildKitchen() {
        return new AmericanKitchen();
    }
}
