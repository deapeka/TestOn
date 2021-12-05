package entity.access;

import entity.model.Course;

import java.util.UUID;

public class Teacher extends UserProfile{

    private Course course;

    public Teacher(UUID id,String fullName, String username, String password, Course course) {
        super(id,fullName, username, password);
        this.course = course;
    }
}
