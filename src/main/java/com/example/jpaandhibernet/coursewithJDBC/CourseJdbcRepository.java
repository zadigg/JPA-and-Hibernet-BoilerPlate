package com.example.jpaandhibernet.coursewithJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
            
            INSERT INTO course (id, name, author)
            values (?, ?, ?);
            
            """;

    private static String DELETE_QUERY =
            """
                
                DELETE FROM jpaandhibernet.course where id = ?;
                
            """;

    private static String SELECT_BY_ID_QUERY =
            """
                
                SELECT * FROM jpaandhibernet.course where id = ?;
                
            """;


    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_QUERY,id);
    }

    public Course selectById(long id) {
        // ResultSet -> Bean => Row Mapper
        return springJdbcTemplate.queryForObject(SELECT_BY_ID_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }

}
