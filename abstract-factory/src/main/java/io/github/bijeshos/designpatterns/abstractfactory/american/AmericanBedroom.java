package io.github.bijeshos.designpatterns.abstractfactory.american;

import io.github.bijeshos.designpatterns.abstractfactory.Bedroom;

public class AmericanBedroom implements Bedroom {
    static final String DESCRIPTION = "American Bedroom";

    @Override
    public void description() {
        System.out.println("Message from " + DESCRIPTION);
    }
}
