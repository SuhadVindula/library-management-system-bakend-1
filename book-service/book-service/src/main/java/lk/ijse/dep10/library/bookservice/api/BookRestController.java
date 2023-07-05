package lk.ijse.dep10.library.bookservice.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
@CrossOrigin
public class BookRestController {
    @PostMapping
    public String saveBook() {
        return "<h1>SaveBooK</h1>";

    }
    @PatchMapping ("/{isbn}")
    public String updateBook() {
        return "<h1>Update Book</h1>";

    }
    @DeleteMapping("/{isbn}")
    public String removeBook() {
        return "<h1>Remove Book</h1>";

    }
    @GetMapping
    public String getBook() {
        return "<h1>Get a book</h1>";

    }
    @PostMapping
    public String findBook() {
        return "<h1>Find Book</h1>";

    }
}
