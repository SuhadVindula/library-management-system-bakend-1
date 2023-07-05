package lk.ijse.dep10.library.bookservice.repository;

import lk.ijse.dep10.library.bookservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, String> {

    List<Book> findBookByIsbnContainsOrTitleContainsOrAuthorContains(String q1, String q2, String q3);

//    @Query("SELECT b FROM Book b WHERE b.isbn LIKE:query OR b.title")
//    List<Book> findBookByQuery(String query)


}
