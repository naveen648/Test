package com.example.FirstSpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dao(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Dao(){
    }

//    @Override
//    public String toString()
//    {
//        return "{id = "+this.getId()+" name = "+this.getName()+", Age = "+this.getAge()+"}";
//    }

}
