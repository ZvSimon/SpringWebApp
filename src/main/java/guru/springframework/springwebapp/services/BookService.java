package guru.springframework.springwebapp.services;

import guru.springframework.springwebapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
