package com.example.myapp.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Modules")
public class Module{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int moduleId;
    String title;

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @ManyToOne()
    @JsonIgnore
    private Course course;

    @OneToMany(mappedBy = "module")
    private List<Lesson> lessons;
}
