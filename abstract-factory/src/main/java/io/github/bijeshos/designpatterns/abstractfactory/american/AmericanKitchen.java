package io.github.bijeshos.designpatterns.abstractfactory.american;

import io.github.bijeshos.designpatterns.abstractfactory.Kitchen;

public class AmericanKitchen implements Kitchen {

    static final String DESCRIPTION = "American Kitchen";

    @Override
    public void description() {
        System.out.println("Message from " + DESCRIPTION);
    }
}
