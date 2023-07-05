package lk.ijse.dep10.library.bookservice.service.impl;

import lk.ijse.dep10.library.bookservice.dto.BookDTO;
import lk.ijse.dep10.library.bookservice.repository.BookRepository;
import lk.ijse.dep10.library.bookservice.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void saveBook(BookDTO book) {

    }

    @Override
    public void updateBook(BookDTO book) {

    }

    @Override
    public void deleteBook(String isbn) {

    }

    @Override
    public BookDTO getBook(String isbn) {
        return null;
    }

    @Override
    public List<BookDTO> findBook(String query) {
        return null;
    }
}
