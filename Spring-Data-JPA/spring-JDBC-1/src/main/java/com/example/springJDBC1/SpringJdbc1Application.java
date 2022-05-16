package com.example.springJDBC1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.QueryLookupStrategy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(SpringJdbc1Application.class, args);
	}
}
