package com.crud.service.impl;

import com.bean.User;
import com.crud.dao.IUserDao;
import com.crud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao dao;

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
