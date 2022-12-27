package k.multiplefactorypattern.exampleTest;

import k.multiplefactorypattern.exampleTest.Lib.Lib;
import k.multiplefactorypattern.exampleTest.Lib.UiFactory;
import k.multiplefactorypattern.exampleTest.products.Button.Button;

public class Client {
    public static void main(String[] args) {
        Lib lib = new Lib();

        //Window
        UiFactory factory = lib.getUiFactory("Window");
        Button winButton = factory.createButton();
        winButton.click();
        winButton.setColor();

        //IOS
        UiFactory iosfactory = lib.getUiFactory("IOS");
        Button iosButton = iosfactory.createButton();
        iosButton.click();
    }
}
