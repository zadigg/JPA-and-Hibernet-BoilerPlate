package com.example.jpaandhibernet.courseWithJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
//        courseJpaRepository.insert(new Course(1, "Love to the grave", "Abel Kibebe"));
//        courseJpaRepository.deleteById(1);
//        System.out.println(courseJpaRepository.findById(1));
    }
}
