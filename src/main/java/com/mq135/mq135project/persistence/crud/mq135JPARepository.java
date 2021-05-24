package com.mq135.mq135project.persistence.crud;

import com.mq135.mq135project.persistence.entity.mq135;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface mq135JPARepository extends JpaRepository<mq135, Integer> {
    @Query(value = "SELECT * FROM mq_135 ORDER BY date DESC LIMIT 1", nativeQuery = true)
    mq135 getLastRecord();

    @Query(value = "SELECT * FROM mq_135 ORDER BY id DESC LIMIT 20", nativeQuery = true)
    List<mq135> getLastTwentyRecords();
}
