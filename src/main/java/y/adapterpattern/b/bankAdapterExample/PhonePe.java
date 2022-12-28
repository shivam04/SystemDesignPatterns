package y.adapterpattern.b.bankAdapterExample;

import y.adapterpattern.b.bankAdapterExample.adapter.BankAPIAdapter;

public class PhonePe {
    BankAPIAdapter adapter;

    public PhonePe(BankAPIAdapter adapter) {
        this.adapter = adapter;
    }

    boolean addToWallet(int amount, String accountNumber) {
        double balance = adapter.checkBalance(accountNumber);
        System.out.println("Account Balance: " + balance);
        boolean result = false;
        if (balance >= amount) {
            result = adapter.deduceBalance(amount);
        }
        return result;
    }
}
