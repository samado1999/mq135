package com.mq135.mq135project.domain.service;

import com.mq135.mq135project.domain.Mq135Domain;
import com.mq135.mq135project.domain.repository.Mq135DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class mq135Service {

    @Autowired
    private Mq135DomainRepository mq135_repository;

    public List<Mq135Domain> getAll() {
        return mq135_repository.getAll();
    }

}
