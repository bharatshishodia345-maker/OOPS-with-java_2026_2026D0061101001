
package com.kiet.library.service;

import com.kiet.library.model.Book;
import com.kiet.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book addBook(Book book) {
        int rows = bookRepository.insert(book);

        if (rows == 1) {
            return book;
        }

        throw new RuntimeException("Book was not inserted");
    }

    public Optional<Book> updateBook(Long id, Book updatedBook) {
        Optional<Book> result = bookRepository.findById(id);

        if (result.isEmpty()) {
            return Optional.empty();
        }

        updatedBook.setBookId(id);
        int rows = bookRepository.update(updatedBook);

        return rows == 1
            ? Optional.of(updatedBook)
            : Optional.empty();
    }

    public boolean deleteBook(Long id) {
        return bookRepository.deleteById(id) == 1;
    }

    public List<Book> searchByCategory(String category) {
        return bookRepository.findByCategory(category);
    }

    public List<Book> findBooksPublishedAfter(int year) {
        return bookRepository.findBooksPublishedAfter(year);
    }
}
