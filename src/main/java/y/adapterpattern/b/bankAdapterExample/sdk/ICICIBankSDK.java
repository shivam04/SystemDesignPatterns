package y.adapterpattern.b.bankAdapterExample.sdk;

public class ICICIBankSDK {
    public double getAccountBalance(String accountNumber) {
        return Math.random()*1000000.0;
    }

    public boolean deductBankBalance(int amount) {
        return (((int)Math.random()*100.0)%2 == 0);
    }
}
