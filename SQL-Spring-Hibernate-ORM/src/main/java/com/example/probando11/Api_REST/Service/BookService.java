package com.example.probando11.Api_REST.Service;

import com.example.probando11.Api_REST.Entidad.Book;
import com.example.probando11.Api_REST.Excepcion.Exception;
import com.example.probando11.Api_REST.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepo repo;

    @Value("${app.message}")
    private String message;


    public List<Book> allBooks(){
        return (List<Book>) this.repo.findAll();
    }
    public Book addBook(Book book){
        verificationCreateBook(book);
        return this.repo.save(book);
    }
    public Book updateBook(Book book){
        verificationModifyBook(book);
        return this.repo.save(book);
    }
    public Book searchBook(long id){
        if(!this.repo.existsById(id)){
            throw new Exception("(Book no exist)");
        }
        return this.repo.findById(id).get();
    }
    public void deleteBook(long id){
        if(!this.repo.existsById(id)){
            throw new Exception("(Book no exist)");
        }
        this.repo.deleteById(id);
    }
    public void deleteAllBook(){
        this.repo.deleteAll();
    }

    private void verificationCreateBook(Book book){
        Optional<Book> optional=this.repo.findByTitle(book.getTitle());
        if(book.getId()!=null){
            throw new Exception("(Trying to create book with ID)");
        }else if(optional.isPresent()){
            throw new Exception("(Trying to create book with same title)");
        }
    }
    private void verificationModifyBook(Book book){
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
