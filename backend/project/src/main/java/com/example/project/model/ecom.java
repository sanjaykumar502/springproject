package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class ecom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String productname;
    String category;
    int price;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getproductname() {
        return productname;
    }
    public void setproductname(String productname) {
        this.productname = productname;
    }
    public String getcategory() {
        return category;
    }
    public void setcategory(String category) {
        this.category = category;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
