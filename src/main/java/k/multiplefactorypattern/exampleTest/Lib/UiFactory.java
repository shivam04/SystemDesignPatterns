package k.multiplefactorypattern.exampleTest.Lib;

import k.multiplefactorypattern.exampleTest.products.Button.Button;
import k.multiplefactorypattern.exampleTest.products.Panel.Panel;
import k.multiplefactorypattern.exampleTest.products.TextBox.TextBox;

public interface UiFactory {
    Button createButton();
    TextBox createTextBox();
    Panel createPanel();
}
