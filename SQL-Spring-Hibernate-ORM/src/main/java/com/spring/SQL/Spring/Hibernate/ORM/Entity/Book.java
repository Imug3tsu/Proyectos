package com.spring.SQL.Spring.Hibernate.ORM.Entity;

import jakarta.persistence.*;
import lombok.*;

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
    @NonNull
    @Column(name = "author")
    private String author;
    @NonNull
    @Column(name = "title")
    private String title;
    @NonNull
    @Column(name = "num_pag")
    private int num_pag;
    @NonNull
    @Column(name = "price")
    private double price;
    @NonNull
    @Column(name = "category")
    private String category;
    @NonNull
    @Column(name = "stock")
    private int stock;
    @NonNull
    @Column(name = "date_")
    private Date date_;

}
