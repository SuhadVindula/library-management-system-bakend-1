package lk.ijse.dep10.library.bookservice.api;

import lk.ijse.dep10.library.bookservice.dto.BookDTO;
import lk.ijse.dep10.library.bookservice.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@CrossOrigin
public class BookRestController {

    private final BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("application/json")
    public String saveBook(@RequestBody @Validated BookDTO bookDTO) {
        return "<h1>SaveBooK</h1>";

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping (value = "/{isbn}", consumes = "application/json")
    public String updateBook(@PathVariable String isbn, @Validated @RequestBody BookDTO bookDTO) {
        return "<h1>Update Book</h1>";

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{isbn}")
    public String removeBook(@PathVariable String isbn) {
        return "<h1>Remove Book</h1>";

    }
    @GetMapping
    public String getBook(@PathVariable String isbn) {
        return "<h1>Get a book</h1>";

    }
    @PostMapping
    public List<BookDTO> findBooks(@RequestParam(name = "q",required = false)String query) {
        if(query==null) query = "";
        return bookService.findBooks(query);

    }
}
