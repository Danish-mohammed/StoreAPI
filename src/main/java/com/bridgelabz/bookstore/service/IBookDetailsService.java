package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.BookStoredto;
import com.bridgelabz.bookstore.model.BookDetails;
import java.util.List;


public interface IBookDetailsService {

    List<BookDetails> showAllBooks();
    BookDetails addBook( BookStoredto bookDto);
    BookDetails getBookById(int bookId);
    BookDetails getBookByName(String bookName);
    BookDetails updateBook(int bookId, BookStoredto bookDTO);
    BookDetails updateBookByName(String bookName, BookStoredto bookDTO);
    void deleteBook(int bookId);
    BookDetails updateBookQuantity(int bookId, int bookQuantity);
    BookDetails updateBookPrice(int bookId, int bookPrice);
    long findBookCount();

    List<BookDetails> sortBookByAsc();

    List<BookDetails> sortBookByDesc();
}
