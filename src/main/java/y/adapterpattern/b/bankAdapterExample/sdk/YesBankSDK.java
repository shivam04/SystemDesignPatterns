package y.adapterpattern.b.bankAdapterExample.sdk;

public class YesBankSDK {
    public double fetchBalance(String accountNumber) {
        return Math.random()*1000000.0;
    }

    public boolean reduceBalance(int amount) {
        return (((int)Math.random()*100.0)%2 == 0);
    }
}
