package y.adapterpattern.b.bankAdapterExample.adapter;

public interface BankAPIAdapter {
    double checkBalance(String accountNumber);
    boolean deduceBalance(int amount);

}
