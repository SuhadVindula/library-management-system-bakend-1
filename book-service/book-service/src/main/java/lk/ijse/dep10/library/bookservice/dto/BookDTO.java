package lk.ijse.dep10.library.bookservice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {
    @NotBlank(message = "ISBN can not be empty")
    private String isbn;
    @NotBlank(message = "Title can not be empty")
    private String title;
    @NotBlank(message = "Author can not be empty")
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Invalid author name")
    private String author;
    @NotNull(message = "Copies can not be empty")
    @PositiveOrZero(message = "Copies can not be negative")
    private Integer copies;
}
