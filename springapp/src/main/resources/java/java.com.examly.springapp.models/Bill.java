package com.examly.springapp;

public class Bill{

    private int billId;
    private int total;
    public int getBillId() {
        return billId;
    }
    public void setBillId(int billId) {
        this.billId = billId;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public Bill(int billId, int total) {
        this.billId = billId;
        this.total = total;
    }
    public Bill() {
        super();
    }


}