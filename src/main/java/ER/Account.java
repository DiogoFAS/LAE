package ER;

import java.util.function.Predicate;

public class Account {
    @Check(valid = "nonNegative")
    private long balance;
    @Check(valid = "dotCom")
    private String email;

    public Account(long balance, String email) {
        this.balance = balance;
        this.email = email;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean nonNegative(long v) {
        return v >= 0;
    }

    public boolean dotCom(String address) {
        return address.endsWith(".com");
    }
}