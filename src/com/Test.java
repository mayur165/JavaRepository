package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> durgalist = new ArrayList<>();
        durgalist.add("JAVA");
        durgalist.add("ORACLE");
        durgalist.add("SPRING");

        ArrayList<String> nareshTechnologyList = new ArrayList<>();
        nareshTechnologyList.add("SQL");
        nareshTechnologyList.add("PLSQL");
        nareshTechnologyList.add("AI");

        ArrayList<String> satyam = new ArrayList<>();
        satyam.add("SQL");
        satyam.add("PLSQL");
        satyam.add("AI");

        ArrayList<String> telusko = new ArrayList<>();
        telusko.add("SQL");
        telusko.add("JAVA");
        telusko.add("SPRING");

        ArrayList<String> mukesh = new ArrayList<>();
        mukesh.add("SQL");
        mukesh.add("PLSQL");
        mukesh.add("STRUTS");

        ArrayList<String> naresh = new ArrayList<>();
        naresh.add("SQL");
        naresh.add("STRUTS");
        naresh.add("AI");

        ArrayList<String> rangaraoList = new ArrayList<>();
        rangaraoList.add("SQL");
        rangaraoList.add("PLSQL");
        rangaraoList.add("AI");

        TrainingProvider tp = new TrainingProvider("DurgaSir","Hyderabad",durgalist);
        TrainingProvider tp1 = new TrainingProvider("NareshTechnology","Bangalore",nareshTechnologyList);
        TrainingProvider tp2 = new TrainingProvider("Satyam","Pune",satyam);
        TrainingProvider tp3 = new TrainingProvider("Mukesh","Chennai",mukesh);
        TrainingProvider tp4 = new TrainingProvider("Naresh","Bangalore",naresh);
        TrainingProvider tp5 = new TrainingProvider("Rangarao","Kerala",rangaraoList);
        TrainingProvider tp6 = new TrainingProvider("Telusko","Bhopal",telusko);


        TrainingMgmtSys tm = new TrainingMgmtSys();
        try {
            System.out.println(tm.addTrainigProvider(tp));
            System.out.println(tm.addTrainigProvider(tp1));
            System.out.println(tm.addTrainigProvider(tp2));
            System.out.println(tm.addTrainigProvider(tp3));
            System.out.println(tm.addTrainigProvider(tp4));
            System.out.println(tm.addTrainigProvider(tp5));
            System.out.println(tm.addTrainigProvider(tp6));

                    }
        catch (ProviderAlreadyExistException p)
        {
            p.printStackTrace();
        }
        Course cc = new Course(101,"JAVA","Online");
        Course cc1 = new Course(102,"ANGULAR","Online");
        Course cc2 = new Course(103,"JAVASCRIPT","Online");
        Course cc3 = new Course(104,"JAVA","Online");
        Course cc4 = new Course(105,"JAVASCRIPT","Online");
        Course cc5 = new Course(106,"PLSQL","Offline");
        Course cc6 = new Course(107,"SQL","Offline");
        Course cc7 = new Course(108,"SPRING","Offline");
        Course cc8 = new Course(109,"STRUTS","Offline");
        Course cc9 = new Course(110,"SPRING","Offline");
        Course cc10 = new Course(111,"STRUTS","Offline");
        Course cc11 = new Course(112,"AI","Offline");
        Course cc12 = new Course(113,"Python","Offline");

        System.out.println(tm.addCourse(cc));
        System.out.println(tm.addCourse(cc1));
        System.out.println(tm.addCourse(cc2));
        System.out.println(tm.addCourse(cc3));
        System.out.println(tm.addCourse(cc4));
        System.out.println(tm.addCourse(cc5));
        System.out.println(tm.addCourse(cc6));
        System.out.println(tm.addCourse(cc7));
        System.out.println(tm.addCourse(cc8));
        System.out.println(tm.addCourse(cc9));
        System.out.println(tm.addCourse(cc10));
        System.out.println(tm.addCourse(cc11));
        System.out.println(tm.addCourse(cc12));

        try {
            System.out.println(tm.updateCourseList("DurgaSir", "Angular"));
            System.out.println(tm.updateCourseList("NareshTechnology", "Python"));
            System.out.println(tm.updateCourseList("DurgaSir", "DataAnalyst"));
            System.out.println(tm.updateCourseList("NareshTechnology", "Javascript"));
            System.out.println(tm.updateCourseList("NareshTechnology", "Python"));
            System.out.println(tm.updateCourseList("DurgaSir", "TypeScript"));
        }
        catch (CourseAlreadyExistsException cl)
        {
            cl.printStackTrace();
        }

        HashSet<String> hs = tm.getUniqueCourseByMode("Online");
        //hs.forEach(i-> System.out.println(i));
        System.out.println("Map starts from here -----------------------------");
        HashMap<String,ArrayList<String>> hst = new HashMap<>();

        hst = tm.getProviderMapByCourse();
        System.out.println(hst);
    }
}
