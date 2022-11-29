package com.sharktank.xharktank.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EntrepreneurDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTable(){
        var query ="CREATE TABLE entrepreneur (id SERIAL PRIMARY KEY,entrepreneur varchar(255),pitchTitle varchar(255),pitchIdea varchar(255))";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }
}

