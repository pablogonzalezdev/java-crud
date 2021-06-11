package com.example.springbootdemo.repositories;

import com.example.springbootdemo.models.SneakerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SneakerRepository extends JpaRepository<SneakerModel, Integer> {

}
