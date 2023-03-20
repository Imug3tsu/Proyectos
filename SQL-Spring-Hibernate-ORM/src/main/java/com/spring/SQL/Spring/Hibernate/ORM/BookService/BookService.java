package com.spring.SQL.Spring.Hibernate.ORM.BookService;


import com.spring.SQL.Spring.Hibernate.ORM.Entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    public List<Book> AllBooks();
    public Book createBook(Book book);
    public Book ModifyBook(Book book);
    public Optional<Book> SearchBook(long id);
    public void deleteBook(long id);
    public void deleteAllBook();

}
