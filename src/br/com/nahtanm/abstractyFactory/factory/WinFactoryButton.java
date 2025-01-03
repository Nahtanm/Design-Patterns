package br.com.nahtanm.abstractyFactory.factory;

import br.com.nahtanm.abstractyFactory.guiFactory.IButton;

public class WinFactoryButton implements IButton {
    @Override
    public void paint() {
        System.out.println("Button Windows");
    }
}
