package com.example.probando11.Api_REST.Repo;

import com.example.probando11.Api_REST.Entidad.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {

    Optional<Book> findByTitle(String title);

}