package com.philodelight.dao;

import com.philodelight.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserJdbcDao implements UserDao{
    
    private JdbcTemplate jdbcTemplate;
    
    public UserJdbcDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    private User RowMapper(){
        User user = new User();
        user.setFirstName("Goofy");
        return user;
    }
    
    @Override
    public User find(Long id) {
        String sql = "SELECT first_name, last_name FROM users WHERE id = ?";
        //int row = jdbcTemplate.query(sql, RowMapper.class );
        return null;
    }
    
    @Override
    public void create(Object o) {
    
    }
    
    @Override
    public void save(User user) {
    
    }
    
    @Override
    public void update(Object o, int id) {
    
    }
    
    @Override
    public void delete(int id) {
    
    }
}
