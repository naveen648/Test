package com.example.FirstSpringBoot.controller;


import com.example.FirstSpringBoot.service.CreateRequest;
import com.example.FirstSpringBoot.models.Dao;
import com.example.FirstSpringBoot.repository.JpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SimpleController {

    @Autowired
    JpaRepo jpaRepo;

    @PostMapping("/insertUser")
    public void insertBook(@RequestBody Dao request)
    {
        Dao dao=new Dao(request.getId(), request.getName(), request.getAge());
        jpaRepo.save(dao);
    }

    @GetMapping("/getUsers")
    public List<Dao> getAllUsers(){
        return jpaRepo.findAll();
    }

//    @GetMapping("/getUserByName/{name}")
//    public List<Dao> getBookByAuthorName(@RequestParam(value="name")String name){
//        return jpaRepo.findByName(name);
//    }

}
