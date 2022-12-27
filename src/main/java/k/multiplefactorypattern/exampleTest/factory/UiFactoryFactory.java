package k.multiplefactorypattern.exampleTest.factory;

import k.multiplefactorypattern.exampleTest.Lib.IOSFactory;
import k.multiplefactorypattern.exampleTest.Lib.UiFactory;
import k.multiplefactorypattern.exampleTest.Lib.WindowsFactory;

public class UiFactoryFactory {
    public static UiFactory getUiFactory(String platform) {
        if ("Window".equals(platform)) {
            return new WindowsFactory();
        } else if ("IOS".equals(platform)) {
            return new IOSFactory();
        }
        /**   ANY NEW type say android will just need to be added to this class ONLY.
         else if("Android".equalsIgnoreCase(platform)) {
            return new AndroidFactory();
         }
         **/
        return new IOSFactory();
    }
}
