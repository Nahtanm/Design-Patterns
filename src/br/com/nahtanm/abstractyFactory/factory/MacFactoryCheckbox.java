package br.com.nahtanm.abstractyFactory.factory;

import br.com.nahtanm.abstractyFactory.guiFactory.ICheckbox;

public class MacFactoryCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("Checkbox MacOS");
    }

}
