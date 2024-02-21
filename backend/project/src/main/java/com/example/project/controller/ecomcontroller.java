package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Login;
import com.example.project.model.ecom;
import com.example.project.service.Loginservice;
import com.example.project.service.ecomservice;
import java.util.List;
import java.util.Optional;


@RestController
public class ecomcontroller {
     @Autowired Loginservice l;
    @Autowired ecomservice b;
    @GetMapping("/getlogin")
    public List <Login> getMethodName() {
        return l.get();
    }
    @GetMapping("/getproduct")
    public List <ecom> getMethod() {
        return b.get();
    }
    @PostMapping("/addlogin")
    public Login postMethodName(@RequestBody Login l1) {
        return l.post(l1);
    }
    @PostMapping("/addproduct")
    public ecom postMethodName(@RequestBody ecom l2) {
        return b.post(l2);
    }
    @PutMapping("/putlogin/{id}")
    public Login putMethodName(@PathVariable int id, @RequestBody Login e1) {        
        return l.put(id, e1);
    }
    @PutMapping("/putecom/{id}")
    public ecom putMethodName(@PathVariable int id, @RequestBody ecom e2) {        
        return b.put(id, e2);
    }
    @DeleteMapping("/deletelogin/{id}")
    public String deletelogin(@PathVariable int id){
        return l.delete(id);
    }
    @DeleteMapping("/deleteecom/{id}")
    public String deletebook(@PathVariable int id){
        return b.delete(id);
    }
    @GetMapping("/getlogin/{id}")
    public Optional <Login> getById (@PathVariable int id) {
        return l.getById(id);
    }
    @GetMapping("/getecom/{id}")
    public Optional <ecom> getByid (@PathVariable int id) {
        return b.getByid(id);
    }
    
}
