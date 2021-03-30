package com.BasicSpringFramwork.Basics.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DAO {

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection jdbcConnection(){
        return jdbcConnection;
    }
}
