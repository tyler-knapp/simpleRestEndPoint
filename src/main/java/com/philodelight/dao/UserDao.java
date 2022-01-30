package com.philodelight.dao;

import com.philodelight.model.User;

public interface UserDao<T> {
    
    User find(Long id);
    
    void create(T t);
    
    void save(User user);
    
    void update(T t, int id);
    
    void delete(int id);
}
