package com.example.springbootdemo.controllers;

import com.example.springbootdemo.repositories.SneakerRepository;
import com.example.springbootdemo.models.SneakerModel;
import com.example.springbootdemo.services.SneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sneakers")
public class SneakerController {
    @Autowired
    private SneakerService sneakerService;

    // HTTP METHOD -> 200 (successful), 500 (internal error), 404 (page not found)
    @PostMapping("/create")
    public SneakerModel create(@RequestBody SneakerModel sneaker) {
        return sneakerService.create(sneaker);
    }

    @GetMapping("/list")
    public List<SneakerModel> list() {
        return sneakerService.list();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        sneakerService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody SneakerModel sneaker) {
        sneakerService.update(sneaker);
    }
}
