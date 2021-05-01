package com.mq135.mq135project.controller;

import com.mq135.mq135project.domain.Mq135Domain;
import com.mq135.mq135project.domain.service.mq135Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mq135")
public class mq135Controller {

    @Autowired
    private mq135Service mq135_service;

    @GetMapping("/all")
    public List<Mq135Domain> getAll() {
        return mq135_service.getAll();
    }
}
