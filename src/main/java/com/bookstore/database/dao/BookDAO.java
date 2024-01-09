package com.bookstore.database.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bookstore.database.entity.Book;

@Repository
public interface BookDAO extends CrudRepository<Book, Long> {

	@Query(value = "SELECT * FROM books WHERE name LIKE %:term%", nativeQuery = true)
	List<Book> findByNameContaining(@Param("term") String term);

}
