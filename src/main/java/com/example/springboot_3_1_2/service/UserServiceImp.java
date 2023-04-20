package com.example.springboot_3_1_2.service;
import com.example.springboot_3_1_2.dao.UserDao;
import com.example.springboot_3_1_2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserDao dao;

    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAll() {
        return dao.getAll();
    }

    @Transactional(readOnly = true)
    @Override
    public User get(int id) {
        return dao.get(id);
    }

    @Transactional
    @Override
    public void create(User user) {
        dao.create(user);
    }

    @Transactional
    @Override
    public void update(User user) {
        dao.update(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}
