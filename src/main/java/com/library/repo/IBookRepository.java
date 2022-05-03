package com.library.repo;

import com.library.model.Book;
import com.library.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBookRepository extends PagingAndSortingRepository<Book,Long> {
    Iterable<Book> findAllByCategory(Category category);
    Iterable<Book> findAllByNameContaining(String name);
}
