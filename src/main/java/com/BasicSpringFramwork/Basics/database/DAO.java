package com.BasicSpringFramwork.Basics.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository // configure database
public class DAO {

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection jdbcConnection(){
        return jdbcConnection;
    }
}
