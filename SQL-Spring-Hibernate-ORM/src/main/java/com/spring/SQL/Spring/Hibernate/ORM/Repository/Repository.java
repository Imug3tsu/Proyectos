package com.spring.SQL.Spring.Hibernate.ORM.Repository;

import com.spring.SQL.Spring.Hibernate.ORM.Entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Book,Long> {

    public Optional<Book> findByTitle(String title);

}
