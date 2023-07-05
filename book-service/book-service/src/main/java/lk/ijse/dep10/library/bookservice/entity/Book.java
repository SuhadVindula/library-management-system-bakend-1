package lk.ijse.dep10.library.bookservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data @AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
@Table(name = "book")
public class Book {
    @Id
    private String isbn;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private int copies;
}
