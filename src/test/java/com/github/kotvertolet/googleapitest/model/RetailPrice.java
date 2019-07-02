package com.github.kotvertolet.googleapitest.model;

import com.google.gson.annotations.SerializedName;

public class RetailPrice {

    @SerializedName("amount")
    private double amount;

    @SerializedName("currencyCode")
    private String currencyCode;

    @SerializedName("amountInMicros")
    private long amountInMicros;

    public RetailPrice() {
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public long getAmountInMicros() {
        return this.amountInMicros;
    }

    public void setAmountInMicros(long amountInMicros) {
        this.amountInMicros = amountInMicros;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RetailPrice)) return false;
        final RetailPrice other = (RetailPrice) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getAmount(), other.getAmount()) != 0) return false;
        final Object this$currencyCode = this.getCurrencyCode();
        final Object other$currencyCode = other.getCurrencyCode();
        if (this$currencyCode == null ? other$currencyCode != null : !this$currencyCode.equals(other$currencyCode))
            return false;
        if (this.getAmountInMicros() != other.getAmountInMicros()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RetailPrice;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $amount = Double.doubleToLongBits(this.getAmount());
        result = result * PRIME + (int) ($amount >>> 32 ^ $amount);
        final Object $currencyCode = this.getCurrencyCode();
        result = result * PRIME + ($currencyCode == null ? 43 : $currencyCode.hashCode());
        final long $amountInMicros = this.getAmountInMicros();
        result = result * PRIME + (int) ($amountInMicros >>> 32 ^ $amountInMicros);
        return result;
    }

    public String toString() {
        return "RetailPrice(amount=" + this.getAmount() + ", currencyCode=" + this.getCurrencyCode() + ", amountInMicros=" + this.getAmountInMicros() + ")";
    }
}