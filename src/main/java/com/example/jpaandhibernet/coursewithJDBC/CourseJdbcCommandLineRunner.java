package com.example.jpaandhibernet.coursewithJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
//        courseJdbcRepository.insert(new Course(1, "Love to the grave", "Abel Kibebe"));
//        courseJdbcRepository.delete(2);
//        System.out.println(courseJdbcRepository.selectById(1));
    }
}
