package com.BasicSpringFramwork.Basics.database;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC connection");
    }
}
