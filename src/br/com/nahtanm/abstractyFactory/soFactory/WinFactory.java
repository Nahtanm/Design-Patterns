package br.com.nahtanm.abstractyFactory.soFactory;

import br.com.nahtanm.abstractyFactory.factory.WinFactoryButton;
import br.com.nahtanm.abstractyFactory.factory.WinFactoryCheckbox;
import br.com.nahtanm.abstractyFactory.guiFactory.GUIFactory;
import br.com.nahtanm.abstractyFactory.guiFactory.IButton;
import br.com.nahtanm.abstractyFactory.guiFactory.ICheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new WinFactoryButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WinFactoryCheckbox();
    }
}
