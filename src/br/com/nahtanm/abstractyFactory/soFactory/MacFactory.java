package br.com.nahtanm.abstractyFactory.soFactory;

import br.com.nahtanm.abstractyFactory.factory.MacFactoryButton;
import br.com.nahtanm.abstractyFactory.factory.MacFactoryCheckbox;
import br.com.nahtanm.abstractyFactory.guiFactory.GUIFactory;
import br.com.nahtanm.abstractyFactory.guiFactory.IButton;
import br.com.nahtanm.abstractyFactory.guiFactory.ICheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new MacFactoryButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacFactoryCheckbox();
    }
}
