package com.bf.bikefinder.com.bf.bikefinder.controllers;

import com.bf.bikefinder.model.Bike;
import com.bf.bikefinder.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/bike")
public class BikeController {

    @Autowired
    private BikeRepository repo;

    @GetMapping
    public Page<Bike> listAll(Pageable  p) {
        return repo.findAll(p);

    }
}
