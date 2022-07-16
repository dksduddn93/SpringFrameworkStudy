package com.tobyspring.chapter6.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final PersonRepository personRepository;

    @Transactional
    public Person save(Person person) {
        return personRepository.save(person);
    }
}
