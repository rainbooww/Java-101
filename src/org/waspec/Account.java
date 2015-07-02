package org.waspec;

/**
 * Created by wei on 2/20/15.
 */
public class Account {
    private String name;
    private double balance;

    public Account(String name,double balance){
        this.name=name;

        if (balance>0.0)
        this.balance=balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount>0)
            balance=balance+depositAmount;
    }

    public double getBalance(){
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

