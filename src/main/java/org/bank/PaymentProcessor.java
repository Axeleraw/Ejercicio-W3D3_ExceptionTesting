package org.bank;

import java.math.BigDecimal;

public class PaymentProcessor {
    private BigDecimal purchaseAmount;

    public PaymentProcessor() {
        setPurchaseAmount(purchaseAmount);
    }

    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public static String processTaxExemptPurchase(Account buyer, Account seller, BigDecimal purchaseAmount){
        buyer.setBalance(buyer.getBalance().subtract(purchaseAmount));
        seller.setBalance(seller.getBalance().add(purchaseAmount));
        return "New buyer balance is " + buyer.getBalance() + ", new seller balance is " + seller.getBalance();

    }

    public static String processTaxedPurchase(Account buyer, Account seller, BigDecimal purchaseAmount){
        BigDecimal taxed = purchaseAmount.multiply(BigDecimal.valueOf(1.4));
        buyer.setBalance(buyer.getBalance().subtract(taxed));
        seller.setBalance(seller.getBalance().add(taxed));
        return "New buyer balance is " + buyer.getBalance() + ", new seller balance is " + seller.getBalance();
    }

    public static String issueRefund(Account buyer, Account seller, BigDecimal purchaseAmount, int percent){
        /*BigDecimal multiplicator = BigDecimal.valueOf(1 + percent/100);
        BigDecimal refund = purchaseAmount.multiply(multiplicator);*/
        BigDecimal refund = purchaseAmount.multiply(BigDecimal.valueOf(1 + percent/100));
        buyer.setBalance(buyer.getBalance().subtract(refund));
        seller.setBalance(seller.getBalance().add(refund));
        return "New buyer balance is " + buyer.getBalance() + ", new seller balance is " + seller.getBalance();
    }
}
