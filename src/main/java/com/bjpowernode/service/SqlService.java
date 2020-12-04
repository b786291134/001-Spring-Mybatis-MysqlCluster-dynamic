package com.bjpowernode.service;

import com.bjpowernode.bean.User;

import java.util.List;

public interface SqlService {
    List<User> selectAll();
    int add(User user);
}
