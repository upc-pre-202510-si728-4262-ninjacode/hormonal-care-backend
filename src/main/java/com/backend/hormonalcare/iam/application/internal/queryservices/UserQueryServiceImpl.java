package com.backend.hormonalcare.iam.application.internal.queryservices;

import com.backend.hormonalcare.iam.domain.model.aggregates.User;
import com.backend.hormonalcare.iam.domain.model.queries.GetAllUsersQuery;
import com.backend.hormonalcare.iam.domain.model.queries.GetUserByIdQuery;
import com.backend.hormonalcare.iam.domain.model.queries.GetUserByUsernameQuery;
import com.backend.hormonalcare.iam.domain.services.UserQueryService;
import com.backend.hormonalcare.iam.infrastructure.persistence.jpa.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserQueryServiceImpl implements UserQueryService {
    private final UserRepository userRepository;

    public UserQueryServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> handle(GetAllUsersQuery query) {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> handle(GetUserByIdQuery query) {
        return userRepository.findById(query.userId());
    }

    @Override
    public Optional<User> handle(GetUserByUsernameQuery query) {
        return userRepository.findByUsername(query.username());
    }
}
