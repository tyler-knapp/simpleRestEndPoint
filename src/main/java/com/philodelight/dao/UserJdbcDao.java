package com.philodelight.dao;

import com.philodelight.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserJdbcDao implements UserDao{
    
    private JdbcTemplate jdbcTemplate;
    
    public UserJdbcDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public User find(Long id) {
        return null;
    }
    
    @Override
    public void save(User user) {
    
    }
    
    @Override
    public void delete(User user) {
    
    }
}
