package br.com.nahtanm.abstractyFactory;

import br.com.nahtanm.abstractyFactory.guiFactory.GUIFactory;
import br.com.nahtanm.abstractyFactory.soFactory.MacFactory;
import br.com.nahtanm.abstractyFactory.soFactory.WinFactory;

import java.lang.module.Configuration;

public class Demo {
    public static void main(String[] args) {

        GUIFactory winFactory = new WinFactory();
        winFactory.createButton().paint();
        winFactory.createCheckbox().paint();

        GUIFactory  macFactory = new MacFactory();
        macFactory.createButton().paint();
        macFactory.createCheckbox().paint();

    }

}
