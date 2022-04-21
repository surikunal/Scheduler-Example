package com.example.scheduler.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.scheduler.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
