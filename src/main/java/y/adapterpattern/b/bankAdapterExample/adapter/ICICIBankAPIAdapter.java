package y.adapterpattern.b.bankAdapterExample.adapter;

import y.adapterpattern.b.bankAdapterExample.sdk.ICICIBankSDK;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private final ICICIBankSDK iciciBankSDK;

    public ICICIBankAPIAdapter(ICICIBankSDK iciciBankSDK) {
        this.iciciBankSDK = iciciBankSDK;
    }

    @Override
    public double checkBalance(String accountNumber) {
        return iciciBankSDK.getAccountBalance(accountNumber);
    }

    @Override
    public boolean deduceBalance(int amount) {
        return iciciBankSDK.deductBankBalance(amount);
    }
}
