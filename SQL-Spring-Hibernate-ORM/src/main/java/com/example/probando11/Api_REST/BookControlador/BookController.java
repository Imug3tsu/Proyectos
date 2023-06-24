package com.example.probando11.Api_REST.BookControlador;

import com.example.probando11.Api_REST.Entidad.Book;
import com.example.probando11.Api_REST.Service.BookService;
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
public class BookController {

    @Autowired
    private BookService service;

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
    @GetMapping("/all")
    public ResponseEntity<List<Book>> all(){
        List<Book> personaList =this.service.allBooks();
        return ResponseEntity.ok(personaList);
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
    @PostMapping("/add")
    public ResponseEntity<Book> add(@RequestBody com.example.probando11.Api_REST.Entidad.Book persona){
        com.example.probando11.Api_REST.Entidad.Book pp=this.service.addBook(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(pp);
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
    @PutMapping("/update")
    public ResponseEntity<Book> update(@RequestBody com.example.probando11.Api_REST.Entidad.Book persona){
        com.example.probando11.Api_REST.Entidad.Book pp=this.service.updateBook(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(pp);
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
    @GetMapping("/search/{id}")
    public ResponseEntity<Book> search(@Parameter(description = "id for book",example = "1") @PathVariable long id){
        Book pp=this.service.searchBook(id);
        return ResponseEntity.ok(pp);
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
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Book> delete(@Parameter(description = "id for book",example = "1") @PathVariable long id){
        this.service.deleteBook(id);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/deleteAll")
    public ResponseEntity<Book> deleteAll(){
        this.service.deleteAllBook();
        return ResponseEntity.ok().build();
    }

}
