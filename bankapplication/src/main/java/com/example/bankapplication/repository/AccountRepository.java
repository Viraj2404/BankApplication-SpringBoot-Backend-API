package com.example.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankapplication.entity.Account;

public interface AccountRepository extends JpaRepository<Account ,Long> {

}
