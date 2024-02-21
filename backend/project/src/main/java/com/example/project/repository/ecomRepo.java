package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.ecom;

public interface ecomRepo extends JpaRepository<ecom,Integer>{
    
}