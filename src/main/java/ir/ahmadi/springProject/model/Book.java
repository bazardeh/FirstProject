package ir.ahmadi.springProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @NotNull
//    @Size(max = 100)
//    @Column(unique = true)
    private String author;
    private String title;
    private String publisher;
    private Date publicationDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "bookSubject_id", nullable = false)
    private BookSubject bookSubject;

    public Book() {
    }

    public Book(Long id, String author, String title, String publisher, Date publicationDate, BookSubject bookSubject) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.bookSubject = bookSubject;
    }

    public Book(String author, String title, String publisher, Date publicationDate, BookSubject bookSubject) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.bookSubject = bookSubject;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public BookSubject getBookSubject() {
        return bookSubject;
    }

    public void setBookSubject(BookSubject bookSubject) {
        this.bookSubject = bookSubject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Book [id=%s, author=%s, title=%s, publisher=%s]", id, author, title, publisher);
    }
}
