package com.mq135.mq135project.domain;

import java.time.LocalDateTime;

public class Mq135Domain {

    private int id_mq135;
    private String data_mq135;
    private LocalDateTime date_mq135;

    public int getId_mq135() {
        return id_mq135;
    }

    public void setId_mq135(int id_mq135) {
        this.id_mq135 = id_mq135;
    }

    public String getData_mq135() {
        return data_mq135;
    }

    public void setData_mq135(String data_mq135) {
        this.data_mq135 = data_mq135;
    }

    public LocalDateTime getDate_mq135() {
        return date_mq135;
    }

    public void setDate_mq135(LocalDateTime date_mq135) {
        this.date_mq135 = date_mq135;
    }
}
