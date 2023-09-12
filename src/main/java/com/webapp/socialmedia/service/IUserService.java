package com.webapp.socialmedia.service;

import com.webapp.socialmedia.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IUserService {
    List<User> findAll();

    <S extends User> S save(S entity);

    Optional<User> findById(String id);

    boolean existsById(String id);
}
