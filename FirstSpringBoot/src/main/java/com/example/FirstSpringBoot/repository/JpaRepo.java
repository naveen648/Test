package com.example.FirstSpringBoot.repository;

import com.example.FirstSpringBoot.models.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaRepo extends JpaRepository<Dao,Integer> {

//    List<Dao> findByName(String name);
}
