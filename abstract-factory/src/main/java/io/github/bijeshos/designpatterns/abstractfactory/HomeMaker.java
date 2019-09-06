package io.github.bijeshos.designpatterns.abstractfactory;

import io.github.bijeshos.designpatterns.abstractfactory.american.AmericanHomeFactory;
import io.github.bijeshos.designpatterns.abstractfactory.european.EuropeanHomeFactory;
import io.github.bijeshos.designpatterns.abstractfactory.indian.IndianHomeFactory;

public class HomeMaker {

    public static HomeFactory makeFactory(HomeType type) {
        switch (type) {
            case AMERICAN:
                return new AmericanHomeFactory();
            case EUROPEAN:
                return new EuropeanHomeFactory();
            case INDIAN:
                return new IndianHomeFactory();
            default:
                throw new IllegalArgumentException("HomeType " + type + " not supported");
        }
    }
}
