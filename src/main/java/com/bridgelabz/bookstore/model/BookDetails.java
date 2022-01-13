package com.bridgelabz.bookstore.model;

import com.bridgelabz.bookstore.dto.BookStoredto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="books")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    @Column( name = "bookName")
    private String bookName;
    @Column  (name = "bookAuthor")
    private String bookAuthor;
    @Column (name = "bookDescription")
    private String bookDescription;
    @Column (name = "bookLogo")
    private String bookLogo;
    @Column (name = "bookPrice")
    private int bookPrice;
    @Column (name = "bookQuantity")
    private int bookQuantity;

    public BookDetails(BookStoredto bookDto) {
       this.createBook(bookDto);
    }

    public void createBook (BookStoredto bookDto){
        this.bookName = bookDto.bookName;
        this.bookAuthor = bookDto.bookAuthor;
        this.bookDescription =  bookDto.bookDescription;
        this.bookLogo =  bookDto.bookLogo;
        this.bookPrice = bookDto.bookPrice;
        this.bookQuantity = bookDto.bookQuantity;

    }


    public void updateBook (BookStoredto bookDto){
        this.bookName = bookDto.bookName;
        this.bookAuthor = bookDto.bookAuthor;
        this.bookDescription =  bookDto.bookDescription;
        this.bookLogo =  bookDto.bookLogo;
        this.bookPrice = bookDto.bookPrice;
        this.bookQuantity = bookDto.bookQuantity;

    }
}
