package k.multiplefactorypattern.exampleTest.Lib;

import k.multiplefactorypattern.exampleTest.products.Button.Button;
import k.multiplefactorypattern.exampleTest.products.Button.WindowsButton;
import k.multiplefactorypattern.exampleTest.products.Panel.Panel;
import k.multiplefactorypattern.exampleTest.products.Panel.WindowsPanel;
import k.multiplefactorypattern.exampleTest.products.TextBox.TextBox;
import k.multiplefactorypattern.exampleTest.products.TextBox.WindowsTextBox;

public class WindowsFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }

    @Override
    public Panel createPanel() {
        return new WindowsPanel();
    }
}
