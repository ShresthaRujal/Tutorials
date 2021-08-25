package com.rujal.multitenent.service;

import com.rujal.multitenent.domain.UserDetail;
import com.rujal.multitenent.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
//    private final CurrentTenantIdentifierResolver currentTenantIdentifierResolver;

    @Override
    public void save(UserDetail user) {
        userRepository.save(user);
//        throw new RuntimeException("test");
    }

    @Override
    public List<UserDetail> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDetail findByUserName(String userName) {
        return userRepository.findByUsername(userName).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
