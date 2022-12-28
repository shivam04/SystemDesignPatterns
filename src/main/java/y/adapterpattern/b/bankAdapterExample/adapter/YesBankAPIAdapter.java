package y.adapterpattern.b.bankAdapterExample.adapter;

import y.adapterpattern.b.bankAdapterExample.sdk.YesBankSDK;

public class YesBankAPIAdapter implements BankAPIAdapter {

    private final YesBankSDK yesBankSDK;

    public YesBankAPIAdapter(YesBankSDK yesBankSDK) {
        this.yesBankSDK = yesBankSDK;
    }

    @Override
    public double checkBalance(String accountNumber) {
        return yesBankSDK.fetchBalance(accountNumber);
    }

    @Override
    public boolean deduceBalance(int amount) {
        return yesBankSDK.reduceBalance(amount);
    }
}
