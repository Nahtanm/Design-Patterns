package br.com.nahtanm.abstractyFactory.factory;

import br.com.nahtanm.abstractyFactory.guiFactory.IButton;

public class MacFactoryButton implements IButton {

    @Override
    public void paint() {
        System.out.println("Button MacOS");
    }

}
