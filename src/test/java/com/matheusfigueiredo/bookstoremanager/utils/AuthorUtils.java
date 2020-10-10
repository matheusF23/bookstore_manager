package com.matheusfigueiredo.bookstoremanager.utils;


import com.github.javafaker.Faker;
import com.matheusfigueiredo.bookstoremanager.dto.AuthorDTO;
import com.matheusfigueiredo.bookstoremanager.entity.Author;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class AuthorUtils {
    private static final Faker faker = Faker.instance();

    public static AuthorDTO createFakeAuthorDTO() {
        return AuthorDTO.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().author())
                .age(faker.number().numberBetween(0, 100))
                .build();
    }

    public static Author createFakeAuthor() {
        return Author.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().author())
                .age(faker.number().numberBetween(0, 100))
                .build();
    }

    public static Author createFakeAuthorFrom(@Valid @NotNull Author authorDTO) {
        return Author.builder()
                .id(authorDTO.getId())
                .name(authorDTO.getName())
                .age(authorDTO.getAge())
                .build();
    }
}
