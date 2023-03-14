package com.backend.librarymanagementsystem.Service;

import com.backend.librarymanagementsystem.Entity.Author;
import com.backend.librarymanagementsystem.Entity.Book;
import com.backend.librarymanagementsystem.Repository.AuthorRepository;
import com.backend.librarymanagementsystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    public void addBook(Book book) throws Exception {

        Author author;
        try {
             author = authorRepository.findById(book.getAuthor().getId()).get();
        }
        catch(Exception e){
            throw new Exception("Author Not Exists");
        }

        List<Book> booksWritten = author.getBooks();
         booksWritten.add(book);

        authorRepository.save(author);
    }
}
