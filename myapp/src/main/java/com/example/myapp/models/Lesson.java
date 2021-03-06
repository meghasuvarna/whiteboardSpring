package com.example.myapp.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Lessons")
public class Lesson {
    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int lessonId;
    String title;

    @ManyToOne()
    @JsonIgnore
    private Module module;

    @OneToMany(mappedBy = "lesson")
    private List<Topic> topics;


}
