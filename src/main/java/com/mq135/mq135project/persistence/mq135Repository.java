package com.mq135.mq135project.persistence;

import com.mq135.mq135project.domain.Mq135Domain;
import com.mq135.mq135project.domain.repository.Mq135DomainRepository;
import com.mq135.mq135project.persistence.crud.mq135CrudRepository;
import com.mq135.mq135project.persistence.crud.mq135JPARepository;
import com.mq135.mq135project.persistence.entity.mq135;
import com.mq135.mq135project.persistence.mapper.mq135Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class mq135Repository implements Mq135DomainRepository {

    @Autowired
    private mq135CrudRepository mq135_crud_repository;

    @Autowired
    private mq135JPARepository mq135_JPA_Repository;

    @Autowired
    private mq135Mapper mapper;

    @Override
    public List<Mq135Domain> getAll() {
        List<mq135> mq_135 = (List<mq135>) mq135_crud_repository.findAll();
        return mapper.toMq135Domains(mq_135);
    }

    @Override
    public Mq135Domain getLastRecord() {
        mq135 mq135_value = mq135_JPA_Repository.getLastRecord();
        return mapper.toMq135Domain(mq135_value);
    }

    @Override
    public Mq135Domain findById(int id) {
        mq135 mq135_value = mq135_crud_repository.findById(id);
        return mapper.toMq135Domain(mq135_value);
    }

    @Override
    public List<Mq135Domain> getLastTwentyRecords() {
        List<mq135> mq_135 = (List<mq135>) mq135_JPA_Repository.getLastTwentyRecords();
        return mapper.toMq135Domains(mq_135);
    }

}
