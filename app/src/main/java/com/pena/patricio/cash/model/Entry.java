package com.pena.patricio.cash.model;

/**
 * Created by patri on 01/07/2017.
 */

public class Entry {
    private String account;
    private String date;
    private String time;
    private String amount;

    public Entry(String account, String date, String time, String amount) {
        this.account = account;
        this.date = date;
        this.time = time;
        this.amount = amount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
