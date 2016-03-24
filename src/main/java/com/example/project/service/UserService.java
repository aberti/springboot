package com.example.project.service;

import org.springframework.stereotype.Repository;

@Repository
public interface UserService {

    void create(String name);

}