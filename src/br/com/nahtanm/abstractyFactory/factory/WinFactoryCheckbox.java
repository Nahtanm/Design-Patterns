package br.com.nahtanm.abstractyFactory.factory;

import br.com.nahtanm.abstractyFactory.guiFactory.ICheckbox;

public class WinFactoryCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("Checkbox Windows");
    }

}
