package com.bookstore.database.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Order> orders;
    @Column(name = "name", nullable = false)
    @NotBlank(message = "{book.name.notBlank}")
    private String name;

    @Column(name = "price", nullable = false)
    @NotNull(message = "{book.price.notBlank}")
    private BigDecimal price;

    @Column(name = "authors", nullable = false)
    @NotBlank(message = "{book.authors.notBlank}")
    private String authors;

    @Column(name = "isbn", nullable = false)
    @NotBlank(message = "{book.isbn.notBlank}")
    @Pattern(regexp = "\\d{10}|\\d{13}", message = "{book.isbn.size}")
    private String isbn;

    @Column(name = "publisher", nullable = false)
    @NotBlank(message = "{book.publisher.notBlank}")
    private String publisher;

    @Column(name = "published_on", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "{book.date.notNull}")
    private LocalDate publishedOn;

    @Column(name = "image_url")
    private String imageUrl;

    public Book(long l, String theLordeOfTheRings, BigDecimal bigDecimal, String s, String s1, String s2, LocalDate now) {
    }

    public Book() {

    }
}
