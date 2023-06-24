package com.example.probando11.Api_REST.Entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "author",nullable = false)
    private String author;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "num_pag",nullable = false)
    private int num_pag;
    @Column(name = "price",nullable = false)
    private double price;
    @Column(name = "category",nullable = false)
    private String category;
    @Column(name = "stock",nullable = false)
    private int stock;
    @Column(name = "date_",nullable = false)
    private Date date_;

}
