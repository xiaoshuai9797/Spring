package com.pctc.service6;

public class Customer {

    private String country;

    private String action;

    private int type;


    public Customer()
    {
        System.out.println("构造函数");
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
