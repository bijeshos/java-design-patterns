package io.github.bijeshos.designpatterns.abstractfactory.indian;

import io.github.bijeshos.designpatterns.abstractfactory.Bedroom;
import io.github.bijeshos.designpatterns.abstractfactory.Hall;
import io.github.bijeshos.designpatterns.abstractfactory.HomeFactory;
import io.github.bijeshos.designpatterns.abstractfactory.Kitchen;

public class IndianHomeFactory implements HomeFactory {
    @Override
    public Hall buildHall() {
        return new IndianHall();
    }

    @Override
    public Bedroom buildBedroom() {
        return new IndianBedroom();
    }

    @Override
    public Kitchen buildKitchen() {
        return new IndianKitchen();
    }
}
