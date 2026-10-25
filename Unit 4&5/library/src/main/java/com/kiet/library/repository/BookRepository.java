
package com.kiet.library.repository;

import com.kiet.library.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {

    private final JdbcTemplate jdbc;

    public BookRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    private final RowMapper<Book> bookMapper = new RowMapper<Book>() {
        @Override
        public Book mapRow(ResultSet rs, int rowNum)
                throws SQLException {

            Book b = new Book();
            b.setBookId(rs.getLong("book_id"));
            b.setTitle(rs.getString("title"));
            b.setAuthor(rs.getString("author"));
            b.setCategory(rs.getString("category"));
            b.setPublicationYear(rs.getInt("publication_year"));
            b.setAvailable(rs.getBoolean("available"));

            return b;
        }
    };

    public List<Book> findAll() {
        return jdbc.query(
            "SELECT * FROM books ORDER BY book_id",
            bookMapper
        );
    }

    public Optional<Book> findById(Long id) {
        List<Book> result = jdbc.query(
            "SELECT * FROM books WHERE book_id = ?",
            bookMapper,
            id
        );

        if (result.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(result.get(0));
    }

    public int insert(Book b) {
        String sql = "INSERT INTO books " +
            "(book_id, title, author, category, publication_year, available) " +
            "VALUES (?, ?, ?, ?, ?, ?)";

        return jdbc.update(
            sql,
            b.getBookId(),
            b.getTitle(),
            b.getAuthor(),
            b.getCategory(),
            b.getPublicationYear(),
            b.isAvailable()
        );
    }

    public int update(Book b) {
        String sql = "UPDATE books SET title = ?, author = ?, " +
            "category = ?, publication_year = ?, available = ? " +
            "WHERE book_id = ?";

        return jdbc.update(
            sql,
            b.getTitle(),
            b.getAuthor(),
            b.getCategory(),
            b.getPublicationYear(),
            b.isAvailable(),
            b.getBookId()
        );
    }

    public int deleteById(Long id) {
        return jdbc.update(
            "DELETE FROM books WHERE book_id = ?",
            id
        );
    }

    public List<Book> findByCategory(String category) {
        return jdbc.query(
            "SELECT * FROM books WHERE LOWER(category) = LOWER(?)",
            bookMapper,
            category
        );
    }

    public List<Book> findBooksPublishedAfter(int year) {
        return jdbc.query(
            "SELECT * FROM books WHERE publication_year >= ?",
            bookMapper,
            year
        );
    }
}
