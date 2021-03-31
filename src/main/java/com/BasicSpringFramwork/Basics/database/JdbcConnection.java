package com.BasicSpringFramwork.Basics.database;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository // configure database
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC connection");
    }
}
