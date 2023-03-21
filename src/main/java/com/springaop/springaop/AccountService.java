package com.springaop.springaop;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public void transfer(Account fromAccount, Account toAccount, double amount) {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

}