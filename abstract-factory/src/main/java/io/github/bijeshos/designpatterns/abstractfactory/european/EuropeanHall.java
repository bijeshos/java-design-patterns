package io.github.bijeshos.designpatterns.abstractfactory.european;

import io.github.bijeshos.designpatterns.abstractfactory.Hall;

public class EuropeanHall implements Hall {

    static final String DESCRIPTION = "European Hall";

    @Override
    public void description() {
        System.out.println("Message from " + DESCRIPTION);
    }

}
