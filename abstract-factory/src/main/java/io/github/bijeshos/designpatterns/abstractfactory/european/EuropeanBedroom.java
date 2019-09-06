package io.github.bijeshos.designpatterns.abstractfactory.european;

import io.github.bijeshos.designpatterns.abstractfactory.Bedroom;

public class EuropeanBedroom implements Bedroom {
    static final String DESCRIPTION = "European Bedroom";

    @Override
    public void description() {
        System.out.println("Message from " + DESCRIPTION);
    }
}
