package com.example.springboot_3_1_2.service;


import com.example.springboot_3_1_2.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();
    public User get(int id);

    public void create(User user);

    public void update(User user);

    public void delete(int id);
}
