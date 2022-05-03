package com.library.service.book;

import com.library.model.Book;
import com.library.model.Category;
import com.library.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService extends IGeneralService<Book> {
    Iterable<Book> findAllByCategory(Category category);
    Iterable<Book> findAllByNameContaining(String name);
}
