package com.mq135.mq135project.controller;

import com.mq135.mq135project.domain.Mq135Domain;
import com.mq135.mq135project.domain.service.mq135Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/mq135")
public class mq135Controller {

    @Autowired
    private mq135Service mq135_service;

    @GetMapping("/all")
    public List<Mq135Domain> getAll() {
        return mq135_service.getAll();
    }

    @GetMapping("/getLastRecord")
    public Mq135Domain getLastRecord() {
        return mq135_service.getLastRecord();
    }

    @GetMapping("/getById/{id}")
    public Mq135Domain findById(@PathVariable("id") int id) {
        return mq135_service.findById(id);
    }

    @GetMapping("/getLastTwentyRecords")
    public List<Mq135Domain> getLastTwentyRecords() {
        return mq135_service.getLastTwentyRecords();
    }
}
