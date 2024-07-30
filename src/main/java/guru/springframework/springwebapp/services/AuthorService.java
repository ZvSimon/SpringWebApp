package guru.springframework.springwebapp.services;

import guru.springframework.springwebapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
