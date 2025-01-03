package br.com.nahtanm.abstractyFactory.guiFactory;

public interface GUIFactory {

    IButton createButton();
    ICheckbox createCheckbox();

}
