package com.spring.SQL.Spring.Hibernate.ORM.ORM.Controller;

import com.spring.SQL.Spring.Hibernate.ORM.BookService.BSIMPL;
import com.spring.SQL.Spring.Hibernate.ORM.Entity.Book;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private BSIMPL impl;

    // NO PUEDO DOCUMENTAR SWAGGER

//    @ApiOperation(value = "Hola como estas",notes = "Nose si esto se ve, me puedes confirmar, Gracias")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200,message = "Datos correctos"),
//            @ApiResponse(code = 400,message = "Datos incorrectos")
//    })
    @GetMapping("/AllBooks")
    public ResponseEntity<List<Book>> AllBooks(){
        List<Book> bookList=this.impl.AllBooks();
        return ResponseEntity.ok(bookList);
    }
    @PostMapping("/CreateBook")
    public ResponseEntity<Book> CreateBook( @RequestBody Book book){
        Book createdBook=this.impl.createBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }
    @PutMapping("/UpdateBook")
    public ResponseEntity<Book> UpdateBook(@RequestBody Book book){
        Book updateBook=this.impl.ModifyBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(updateBook);
    }
    @GetMapping("/findByID/{id}")
    public ResponseEntity<Book> findByID(@PathVariable long id){
        return this.impl.SearchBook(id).map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }
    @DeleteMapping("/DeleteByID/{id}")
    public ResponseEntity<Book> DeleteByID(@PathVariable long id){
        this.impl.deleteBook(id);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/DeleteAll")
    public ResponseEntity<Book> DeleteAll(){
        this.impl.deleteAllBook();
        return ResponseEntity.ok().build();
    }

}
