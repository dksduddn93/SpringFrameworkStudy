package com.tobyspring.chapter6.transaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class TransactionTest {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void aa() {
        Person save = transactionService.save(new Person());
        System.out.println(save);
    }
}
