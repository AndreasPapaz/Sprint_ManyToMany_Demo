package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student {
    @Id
    Long id;

    @ManyToMany
    @JoinTable(
            name="enrollment",
            joinColumns =  @JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
        )
    Set<Course> courses;

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
