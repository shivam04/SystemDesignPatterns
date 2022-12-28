package y.adapterpattern.b.bankAdapterExample;

import y.adapterpattern.b.bankAdapterExample.adapter.ICICIBankAPIAdapter;
import y.adapterpattern.b.bankAdapterExample.adapter.YesBankAPIAdapter;
import y.adapterpattern.b.bankAdapterExample.sdk.ICICIBankSDK;
import y.adapterpattern.b.bankAdapterExample.sdk.YesBankSDK;

public class PhonePeDriver {
    public static void main(String[] args) {
        PhonePe yesBankPhonePe = new PhonePe(new YesBankAPIAdapter(new YesBankSDK()));
        PhonePe iciciBankPhonePe = new PhonePe(new ICICIBankAPIAdapter(new ICICIBankSDK()));
        System.out.println(yesBankPhonePe.addToWallet(10000, "1234567890"));
        System.out.println(iciciBankPhonePe.addToWallet(20000, "0987654321"));
    }
}
