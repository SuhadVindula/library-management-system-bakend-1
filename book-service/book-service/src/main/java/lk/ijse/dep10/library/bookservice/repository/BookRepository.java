package lk.ijse.dep10.library.bookservice.repository;

import lk.ijse.dep10.library.bookservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, String> {


}
