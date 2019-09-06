package io.github.bijeshos.designpatterns.abstractfactory.european;

import io.github.bijeshos.designpatterns.abstractfactory.Kitchen;

public class EuropeanKitchen implements Kitchen {

    static final String DESCRIPTION = "European Kitchen";

    @Override
    public void description() {
        System.out.println("Message from " + DESCRIPTION);
    }
}
