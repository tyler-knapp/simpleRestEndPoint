package com.philodelight;

import com.philodelight.dao.UserDao;
import com.philodelight.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.util.List;

@SpringBootApplication
public class Application {
	
	private static UserDao<User> dao;
	
	public Application(UserDao<User> dao) {
		this.dao = dao;
	}
	
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		String jdbcUrl = "jdbc:postgresql://localhost:5432/Contacts";
		String username = "postgres";
		String password = "postgres1";

		try{
			
			Connection jdbcConnection = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Connection to Postgres Successful");
			
			System.out.println("------------------------All USERS ---------------------");
		List<User> users = dao.list();
		users.forEach(System.out::println);

			String sql = "SELECT * FROM users";
			Statement statement = jdbcConnection.createStatement();

			ResultSet result = statement.executeQuery(sql);
			while(result.next()){
				int id = result.getInt("id");
				String firstName = result.getString("first_name");
				String lastName = result.getString("last_name");
				System.out.println( id + " " + firstName + " " + lastName );
			}
			jdbcConnection.close();

		} catch(SQLException e) {
			System.out.println("Error Connecting to DataBase");
			e.printStackTrace();
		}
	}
}
