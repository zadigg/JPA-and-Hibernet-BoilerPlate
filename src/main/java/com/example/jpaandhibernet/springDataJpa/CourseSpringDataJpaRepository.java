package com.example.jpaandhibernet.springDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<CourseSpringJPA, Long> {

    List<CourseSpringJPA> findByAuthor(String author);

    List<CourseSpringJPA> findByName(String name);

    List<CourseSpringJPA> findByNameAndAuthor(String name, String author);
}
