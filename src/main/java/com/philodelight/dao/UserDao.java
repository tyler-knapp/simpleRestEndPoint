package com.philodelight.dao;

import com.philodelight.model.User;

import java.util.List;

public interface UserDao<T> {
    
    List<T> list();
    
    void create(T t);
    
    void update(T t, int id);
    
    void delete(int id);
}
