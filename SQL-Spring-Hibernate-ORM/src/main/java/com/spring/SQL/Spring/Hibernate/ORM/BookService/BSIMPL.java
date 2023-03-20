package com.spring.SQL.Spring.Hibernate.ORM.BookService;

import com.spring.SQL.Spring.Hibernate.ORM.Entity.Book;
import com.spring.SQL.Spring.Hibernate.ORM.Exception.Exception;
import com.spring.SQL.Spring.Hibernate.ORM.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BSIMPL implements BookService {

    @Autowired
    private Repository repo;
    @Value("${app.message}")
    private String message;


    @Override
    public List<Book> AllBooks(){
        return (List<Book>) this.repo.findAll();
    }
    @Override
    public Book createBook(Book book){
        VerificationCreateBook(book);
        return this.repo.save(book);
    }
    @Override
    public Book ModifyBook(Book book){
        VerificationModifyBook(book);
        return this.repo.save(book);
    }
    @Override
    public Optional<Book> SearchBook(long id){
        if(!this.repo.existsById(id)){
           throw new Exception("(Book no exist)");
        }
        return this.repo.findById(id);
    }
    @Override
    public void deleteBook(long id){
        if(!this.repo.existsById(id)){
            throw new Exception("(Book no exist)");
        }
        this.repo.deleteById(id);
    }
    @Override
    public void deleteAllBook(){
        this.repo.deleteAll();
    }

    private void VerificationCreateBook(Book book){
        Optional<Book> optional=this.repo.findByTitle(book.getTitle());
        if(book.getId()!=null){
            throw new Exception("(Trying to create book with ID)");
        }else if(optional.isPresent()){
            throw new Exception("(Trying to create book with same title)");
        }
    }
    private void VerificationModifyBook(Book book){
        Optional<Book> optional=this.repo.findByTitle(book.getTitle());
        if(book.getId()==null){
            throw new Exception("(Trying to modify book without ID)");
        }else if(!this.repo.existsById(book.getId())){
            throw new Exception("(Trying to modify book no exist)");
        }else if(optional.isPresent()){
            throw new Exception("(Trying to modify book with same title)");
        }
    }

}
