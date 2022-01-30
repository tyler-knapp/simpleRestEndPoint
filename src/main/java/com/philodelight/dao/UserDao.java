package com.philodelight.dao;

import com.philodelight.model.User;

public interface UserDao {
    
    public User find(Long id);
    
    public void save(User user);
    
    public void delete(User user);
}
