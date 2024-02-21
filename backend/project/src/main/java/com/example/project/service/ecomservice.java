package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.repository.ecomRepo;
import com.example.project.model.ecom;

import java.util.List;
import java.util.Optional;


@Service
public class ecomservice {
    @Autowired ecomRepo repo;
    public ecom post(ecom b){
        return repo.save(b);
    }
    public List<ecom> get(){
        return repo.findAll();
    }
    public Optional<ecom> getByid(int id){
        return repo.findById(id);
    }
    public String delete(int id){
        repo.deleteById(id);
        return "deleted";
    }
    public ecom put(int id,ecom bo){
        ecom b=repo.findById(id).orElse(null);
        if(b!=null){
            b.setId(bo.getId());
            b.setproductname(bo.getproductname());
            b.setcategory(bo.getcategory());
            b.setPrice(bo.getPrice());
            return repo.saveAndFlush(b);
        }
        else{
            return null;
        }
    }
}
