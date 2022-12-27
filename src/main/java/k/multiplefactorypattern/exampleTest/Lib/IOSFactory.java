package k.multiplefactorypattern.exampleTest.Lib;

import k.multiplefactorypattern.exampleTest.products.Button.Button;
import k.multiplefactorypattern.exampleTest.products.Button.IOSButton;
import k.multiplefactorypattern.exampleTest.products.Panel.IOSPanel;
import k.multiplefactorypattern.exampleTest.products.Panel.Panel;
import k.multiplefactorypattern.exampleTest.products.TextBox.IOSTextBox;
import k.multiplefactorypattern.exampleTest.products.TextBox.TextBox;

public class IOSFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public TextBox createTextBox() {
        return new IOSTextBox();
    }

    @Override
    public Panel createPanel() {
        return new IOSPanel();
    }
}
