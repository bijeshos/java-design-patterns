package io.github.bijeshos.designpatterns.abstractfactory.american;

import io.github.bijeshos.designpatterns.abstractfactory.Hall;

public class AmericanHall implements Hall {

    static final String DESCRIPTION = "American Hall";

    @Override
    public void description() {
        System.out.println("Message from " + DESCRIPTION);
    }

}
