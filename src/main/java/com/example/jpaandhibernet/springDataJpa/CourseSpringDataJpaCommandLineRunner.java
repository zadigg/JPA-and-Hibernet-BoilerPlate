package com.example.jpaandhibernet.springDataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
//        courseSpringDataJpaRepository.save(new CourseSpringJPA(1, "Love to the grave", "Abel Kibebe"));
//        courseSpringDataJpaRepository.deleteById(1L);
//        System.out.println(courseSpringDataJpaRepository.findById(1L));
//        System.out.println(courseSpringDataJpaRepository.findByAuthor("Abel Kibebe"));
//        System.out.println(courseSpringDataJpaRepository.findByName("Love to the grave"));
        System.out.println(courseSpringDataJpaRepository.findByNameAndAuthor("Love to the grave", "Abel Kibebe"));
    }
}
