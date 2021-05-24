package com.mq135.mq135project.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mq_135")
public class mq135 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idMq135;

    @Column(name = "data")
    private Integer dataMq135;

    @Column(name = "date")
    private LocalDateTime dateMq135;

    public Integer getIdMq135() {
        return idMq135;
    }

    public void setIdMq135(Integer idMq135) {
        this.idMq135 = idMq135;
    }

    public Integer getDataMq135() {
        return dataMq135;
    }

    public void setDataMq135(Integer dataMq135) {
        this.dataMq135 = dataMq135;
    }

    public LocalDateTime getDateMq135() {
        return dateMq135;
    }

    public void setDateMq135(LocalDateTime dateMq135) {
        this.dateMq135 = dateMq135;
    }
}
