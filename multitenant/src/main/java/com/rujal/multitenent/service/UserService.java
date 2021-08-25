package com.rujal.multitenent.service;

import com.rujal.multitenent.domain.UserDetail;

import java.util.List;

public interface UserService {

    void save(UserDetail build);

    List<UserDetail> findAll();

    UserDetail findByUserName(String userName);
}
