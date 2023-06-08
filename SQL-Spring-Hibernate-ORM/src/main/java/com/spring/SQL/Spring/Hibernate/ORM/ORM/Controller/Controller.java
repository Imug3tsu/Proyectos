package com.spring.SQL.Spring.Hibernate.ORM.ORM.Controller;

import com.spring.SQL.Spring.Hibernate.ORM.BookService.BSIMPL;
import com.spring.SQL.Spring.Hibernate.ORM.Entity.Book;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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


    @Operation(summary = "List of all book's")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "List of all book's",
            content = {
                    @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Book.class))
            }),
            @ApiResponse(responseCode = "500",description = "List invalid error", content = @Content),
            @ApiResponse(responseCode = "400",description = "Error in Response Body",content = @Content)
    })
    @GetMapping("/AllBooks")
    public ResponseEntity<List<Book>> AllBooks(){
        List<Book> bookList=this.impl.AllBooks();
        return ResponseEntity.ok(bookList);
    }

    @Operation(summary = "Add Book")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "Book add successfully",
            content = {
                    @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Book.class))
            }),
            @ApiResponse(responseCode = "500",description = "Error of parameters", content = @Content),
            @ApiResponse(responseCode = "400",description = "Error in Response Body",content = @Content)
    })
    @PostMapping("/CreateBook")
    public ResponseEntity<Book> CreateBook(@RequestBody Book book){
        Book createdBook=this.impl.createBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }

    @Operation(summary = "Update Book")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "book updated successfully",
            content = {
                    @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Book.class))
            }),
            @ApiResponse(responseCode = "500",description = "Error of parametrs",content = @Content),
            @ApiResponse(responseCode = "400",description = "Error in Response Body",content = @Content)
    })
    @PutMapping("/UpdateBook")
    public ResponseEntity<Book> UpdateBook(@RequestBody Book book){
        Book updateBook=this.impl.ModifyBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(updateBook);
    }

    @Operation(summary = "Search Book for id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Information of book",
                    content = {
                    @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Book.class))
                    }),
            @ApiResponse(responseCode = "500",description = "id invalid", content = @Content),
            @ApiResponse(responseCode = "400",description = "Error in Response Body",content = @Content)
    })
    @GetMapping("/findByID/{id}")
    public ResponseEntity<Book> findByID(@Parameter(description = "id for book",example = "1") @PathVariable long id){
        return this.impl.SearchBook(id).map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }

    @Operation(summary = "Delete Book for id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Book deleted seccessfully",
            content = {
                    @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Book.class))
            }),
            @ApiResponse(responseCode = "500",description = "id invalid",content = @Content),
            @ApiResponse(responseCode = "400",description = "Error in Response Body",content = @Content)
    })
    @DeleteMapping("/DeleteByID/{id}")
    public ResponseEntity<Book> DeleteByID(@Parameter(description = "id for book",example = "1") @PathVariable long id){
        this.impl.deleteBook(id);
        return ResponseEntity.ok().build();
    }
    @Operation(summary = "Delete all Book's")
    @DeleteMapping("/DeleteAll")
    public ResponseEntity<Book> DeleteAll(){
        this.impl.deleteAllBook();
        return ResponseEntity.ok().build();
    }

}
