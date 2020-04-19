package com;

import java.util.ArrayList;

public class TrainingProvider {
    private String name;
    private String location;
    private ArrayList<String> courses;
    static int i = 0;

    public TrainingProvider(String name, String location, ArrayList<String> courses) {
        this.name = name;
        this.location = location;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

  /*  @Override
    public int hashCode()
    {
       return i++;
    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof TrainingProvider) {
            TrainingProvider t = (TrainingProvider) o;
            if (t.getCourses() == this.getCourses() && t.getLocation() == this.getLocation() && t.getName() == this.getName()) {
                return true;

            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ++i;
    }
}
