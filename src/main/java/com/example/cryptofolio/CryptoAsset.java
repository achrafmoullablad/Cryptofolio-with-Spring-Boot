package com.example.cryptofolio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CRYPTOASSET")
public class CryptoAsset {

    @Id
    private String symbol;

    private double total;

    @Transient
    private double price;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CryptoAsset{" +
                "symbol='" + symbol + '\'' +
                ", total=" + total +
                ", price=" + price +
                '}';
    }
}
