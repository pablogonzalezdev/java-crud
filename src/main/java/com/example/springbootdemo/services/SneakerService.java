package com.example.springbootdemo.services;

import com.example.springbootdemo.models.SneakerModel;
import com.example.springbootdemo.repositories.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SneakerService {

    /*
        Probably better practice -> constructor-based injection >> field-based injection
        private final SneakerDAO sneakerDAO;

        @Autowired
        public sneakerDAOConstructor(SneakerDAO sneaker) {
            this.sneakerDAO = sneaker;
        }
     */

    @Autowired
    SneakerRepository sneakerRepository;

    public SneakerModel create(@RequestBody SneakerModel sneakerModel) {
        return sneakerRepository.save(sneakerModel);
    }

    public List<SneakerModel> list() {
        return sneakerRepository.findAll();
    }

    public void delete(@PathVariable("id") Integer id) {
        sneakerRepository.deleteById(id);
    }

    public void update(@RequestBody SneakerModel sneakerModel) {
        sneakerRepository.save(sneakerModel);
    }
}
