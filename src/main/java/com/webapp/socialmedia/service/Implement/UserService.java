package com.webapp.socialmedia.service.Implement;

import com.webapp.socialmedia.entity.Role;
import com.webapp.socialmedia.entity.User;
import com.webapp.socialmedia.repository.UserRepository;
import com.webapp.socialmedia.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public <S extends User> S save(S entity) {
        return userRepository.save(entity);
    }

    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean existsById(String id) {
        return userRepository.existsById(id);
    }

    public void createAdminAccount(){
        System.err.println(UUID.randomUUID());
        System.err.println(UUID.randomUUID().toString());
        User admin = new User();
        admin.setId(UUID.randomUUID().toString());
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin");
        admin.setRole(Role.ADMIN);

        userRepository.save(admin);
    }
}
