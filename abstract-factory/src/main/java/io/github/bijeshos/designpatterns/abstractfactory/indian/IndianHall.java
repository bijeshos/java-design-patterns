package io.github.bijeshos.designpatterns.abstractfactory.indian;

import io.github.bijeshos.designpatterns.abstractfactory.Hall;

public class IndianHall implements Hall {

    static final String DESCRIPTION = "Indian Hall";

    @Override
    public void description() {
        System.out.println("Message from " + DESCRIPTION);
    }

}
