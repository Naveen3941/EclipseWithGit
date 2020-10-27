package com.example.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Customer {
private int id;
private String name;
private String email;
}
