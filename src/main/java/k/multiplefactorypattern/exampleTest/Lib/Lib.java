package k.multiplefactorypattern.exampleTest.Lib;

import k.multiplefactorypattern.exampleTest.factory.UiFactoryFactory;

public class Lib {
    public void setAspectRatio(int i) {
        ///////
    }

    public UiFactory getUiFactory(String platform){
        return UiFactoryFactory.getUiFactory(platform);
    }
}
