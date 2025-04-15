package com.shreyash.paper_trading.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class PortfolioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int srNo;
    private int mobileno;
    private String stock_name;
    private BigDecimal stock_buy_price;
    private BigDecimal stock_sell_price;
    private Date buy_date;
    private Date sell_date;
    private boolean isOnHold;
    private BigDecimal profitLoss;

    public PortfolioModel() {
    }

    public PortfolioModel(String stock_name, int mobileno, BigDecimal stock_buy_price, BigDecimal stock_sell_price, Date buy_date, Date sell_date, boolean isOnHold, BigDecimal profitLoss) {
        this.stock_name = stock_name;
        this.mobileno = mobileno;
        this.stock_buy_price = stock_buy_price;
        this.stock_sell_price = stock_sell_price;
        this.buy_date = buy_date;
        this.sell_date = sell_date;
        this.isOnHold = isOnHold;
        this.profitLoss = profitLoss;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public BigDecimal getStock_buy_price() {
        return stock_buy_price;
    }

    public void setStock_buy_price(BigDecimal stock_buy_price) {
        this.stock_buy_price = stock_buy_price;
    }

    public BigDecimal getStock_sell_price() {
        return stock_sell_price;
    }

    public void setStock_sell_price(BigDecimal stock_sell_price) {
        this.stock_sell_price = stock_sell_price;
    }

    public Date getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    public Date getSell_date() {
        return sell_date;
    }

    public void setSell_date(Date sell_date) {
        this.sell_date = sell_date;
    }

    public boolean isOnHold() {
        return isOnHold;
    }

    public void setOnHold(boolean onHold) {
        isOnHold = onHold;
    }
}
