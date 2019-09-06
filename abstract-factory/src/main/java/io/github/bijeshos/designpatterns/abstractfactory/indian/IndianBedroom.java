package io.github.bijeshos.designpatterns.abstractfactory.indian;

import io.github.bijeshos.designpatterns.abstractfactory.Bedroom;

public class IndianBedroom implements Bedroom {
    static final String DESCRIPTION = "Indian Bedroom";

    @Override
    public void description() {
        System.out.println("Message from " + DESCRIPTION);
    }
}
