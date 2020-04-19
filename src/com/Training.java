package com;

public interface Training {
    int addTrainigProvider(TrainingProvider tp) throws ProviderAlreadyExistException;
    int addCourse(Course c);
    String updateCourseList(String old,String newCourse) throws CourseAlreadyExistsException;

}
