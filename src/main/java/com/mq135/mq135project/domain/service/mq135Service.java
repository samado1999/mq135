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

    public Mq135Domain getLastRecord() {
        return mq135_repository.getLastRecord();
    }

    public Mq135Domain findById(int id) {
        return mq135_repository.findById(id);
    }

    public List<Mq135Domain> getLastTwentyRecords() {
        return mq135_repository.getLastTwentyRecords();
    }
}
