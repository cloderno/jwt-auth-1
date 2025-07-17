package com.cloderno.jwt_auth_1.service;

import com.cloderno.jwt_auth_1.domain.entity.User;
import com.cloderno.jwt_auth_1.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }
}
