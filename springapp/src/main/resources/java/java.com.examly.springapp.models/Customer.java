package com.examly.springapp;
public class Customer {
    private int customerId;
    private String customerName;
    private int age;
    private long mobile;
    bill Bill;
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public bill getBill() {
        return Bill;
    }
    public void setBill(bill bill) {
        Bill = bill;
    }
    public Customer(int customerId, String customerName, int age, long mobile, bill bill) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.age = age;
        this.mobile = mobile;
        Bill = bill;
    }
    public Customer() {
        super
    }

    

}
