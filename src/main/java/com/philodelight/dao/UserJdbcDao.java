package com.philodelight.dao;

import com.philodelight.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserJdbcDao implements UserDao<User>{
    
    private static final Logger logger = LoggerFactory.getLogger(UserJdbcDao.class);
    private JdbcTemplate jdbcTemplate;
    
    public UserJdbcDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    RowMapper<User> rowMapper = (rs, rowNum) -> {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setFirstName(rs.getString("first_name"));
        user.setLastName(rs.getString("last_name"));
        return user;
    };
    
    @Override
    public List<User> list() {
        String sql = "SELECT id, first_name, last_name FROM users";
        return jdbcTemplate.query(sql, rowMapper);
    }
    
    @Override
    public void create(User user) {
    
    }
    
    @Override
    public void update(User user, int id) {
    
    }
    
    @Override
    public void delete(int id) {
    
    }
}
