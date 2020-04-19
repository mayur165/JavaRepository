package com;

public class Course {
    private int courseId;
    private String courseName;
    private String modeOfDelivery;

    public Course(int courseId, String courseName, String modeOfDelivery) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.modeOfDelivery = modeOfDelivery;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getModeOfDelivery() {
        return modeOfDelivery;
    }

    public void setModeOfDelivery(String modeOfDelivery) {
        this.modeOfDelivery = modeOfDelivery;
    }
}
