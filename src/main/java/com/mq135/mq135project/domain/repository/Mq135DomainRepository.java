package com.mq135.mq135project.domain.repository;

import com.mq135.mq135project.domain.Mq135Domain;

import java.util.List;

public interface Mq135DomainRepository {
    List<Mq135Domain> getAll();
    Mq135Domain getLastRecord();
    Mq135Domain findById(int id);
    List<Mq135Domain> getLastTwentyRecords();
}
