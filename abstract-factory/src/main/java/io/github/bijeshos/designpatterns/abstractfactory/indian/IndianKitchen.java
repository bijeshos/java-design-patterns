package io.github.bijeshos.designpatterns.abstractfactory.indian;

import io.github.bijeshos.designpatterns.abstractfactory.Kitchen;

public class IndianKitchen implements Kitchen {

    static final String DESCRIPTION = "Indian Kitchen";

    @Override
    public void description() {
        System.out.println("Message from " + DESCRIPTION);
    }
}
