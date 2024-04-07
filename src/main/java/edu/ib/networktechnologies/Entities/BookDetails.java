package edu.ib.networktechnologies.Entities;


import jakarta.persistence.*;

@Entity
public class BookDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookDetailsId;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;
    @Column(name = "genre")
    private String genre;
    @Column(name = "summary")
    private String summary;
    @Column(name = "cover_image_URL")
    private String coverImageURL;

    public void setBookDetailsId(Long bookDetailsId) {
        this.bookDetailsId = bookDetailsId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImageURL() {
        return coverImageURL;
    }

    public void setCoverImageURL(String coverImageURL) {
        this.coverImageURL = coverImageURL;
    }

    private Long getBookDetailsId() {
        return bookDetailsId;
    }
}
