package com.mq135.mq135project.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mq_135")
public class mq135 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id_mq135_db;

    @Column(name = "data")
    private String data_mq135_db;

    @Column(name = "date")
    private LocalDateTime date_mq135_db;

    public Integer getId_mq135_db() {
        return id_mq135_db;
    }

    public void setId_mq135_db(Integer id_mq135_db) {
        this.id_mq135_db = id_mq135_db;
    }

    public String getData_mq135_db() {
        return data_mq135_db;
    }

    public void setData_mq135_db(String data_mq135_db) {
        this.data_mq135_db = data_mq135_db;
    }

    public LocalDateTime getDate_mq135_db() {
        return date_mq135_db;
    }

    public void setDate_mq135_db(LocalDateTime date_mq135_db) {
        this.date_mq135_db = date_mq135_db;
    }
}
