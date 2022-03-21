package com.example.project1.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AccountRepository {
    @Autowired
    AccountMapper accountMapper;


    public Account save(Account account, String role) {
        accountMapper.insertUser(account);
        accountMapper.insertUserAuthority(account.getId(), role);
        return account;
    }

    public Account findById(String username) {
        // TODO Auto-generated method stub
        return accountMapper.readAccount(username);
    }

    public List<String> findAuthoritiesById(String username) {
        return accountMapper.readAuthorities(username);
    }
}


