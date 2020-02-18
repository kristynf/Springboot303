package com.kristyn.springboot303;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Course course;
        course = new Course("Astrophysics", "Neil D Tyson", "Just a Course on Stars", 3);
        repository.save(course);

        course = new Course("Calculus", "Carol Henley", "Rate of Change of the Rate of Change", 3);
        repository.save(course);

        course = new Course("Freshman English", "Geraldine Pegram", "Learn Your Language Children", 3);
        repository.save(course);
    }
}
