package com;


import java.util.*;

public class TrainingMgmtSys implements Training{
    List<TrainingProvider> tpList = new ArrayList<>();
    List<Course> courseList = new ArrayList<>();


    @Override
    public int addTrainigProvider(TrainingProvider tp)throws ProviderAlreadyExistException {
        boolean flag = false;
        if(tpList.size()>0)
        {
            Iterator itr = tpList.iterator();
            while (itr.hasNext())
            {
                TrainingProvider tpp = (TrainingProvider)itr.next();

                if(tpp.getName().equals(tp.getName()) && (tpp.getLocation().equals(tp.getLocation())))
                {
                    throw new ProviderAlreadyExistException("Training Provider Already Exist !! Please recheck before adding");
                }
                else{
                    flag = true;
                }
            }
            if(flag)
            {
                tpList.add(tp);
            }
        }
        else{
            tpList.add(tp);
        }

        return tpList.size();
    }

    @Override
    public int addCourse(Course c) {
        boolean flag = false;
        if(courseList.size()>0)
        {
            Iterator itr = courseList.iterator();
            while (itr.hasNext())
            {
                Course cpp = (Course)itr.next();

                if(cpp.getCourseId()==(c.getCourseId()))
                {
                    break;
                }
                else{
                    flag = true;
                }
            }
            if(flag)
            {
                courseList.add(c);
            }
        }
        else{
            courseList.add(c);
        }
//courseList.forEach(i-> System.out.println(i.getModeOfDelivery() +"\n"+ i.getCourseId()+"\n"+i.getCourseName()));
        return courseList.size();
    }

    @Override
    public String updateCourseList(String old, String newCourse) throws CourseAlreadyExistsException {
        boolean flag = false;
        int counter = 0;
        if(tpList.size()>0)
        {
            Iterator itr = tpList.iterator();
            while (itr.hasNext())
            {
                TrainingProvider tp = (TrainingProvider)itr.next();
                Iterator itrnew = tp.getCourses().iterator();
                //ListIterator<String> itrnew = tp.getCourses().listIterator();
                if(tp.getName().equals(old)) {
                    while(itrnew.hasNext()) {
                        String courses = (String) itrnew.next();
                        if (!courses.equals(newCourse)) {
                            tp.getCourses().add(newCourse);
                            tp.setCourses(tp.getCourses());
                            tpList.set(counter,tp);
                            counter++;
                            //tpList.forEach(i-> System.out.println("Trainer name: "+i.getName()+" Trainer Location: "+i.getLocation()+" Courses Offered "+i.getCourses()));
                            return "Course Sucessfully added";
                        } else {
                            throw new CourseAlreadyExistsException("Course Already Exists!! Please recheck before updating");
                        }
                    }
                }
                else{
                    flag=true;
                    counter++;
                }
            }
            if(flag){
                System.out.println("Provider not found ! Please recheck");
            }
        }
        else{
            return "List is empty";
        }

        return null;
    }

     HashSet<String> getUniqueCourseByMode(String mode)
    {
        HashSet<String> hs = new HashSet<>();
        ListIterator itr = courseList.listIterator();
        while(itr.hasNext())
        {
            Course c = (Course)itr.next();
            if(c.getModeOfDelivery().equals(mode))
            {
                hs.add(c.getCourseName());
            }
        }
    return hs;
    }

    HashMap<String,ArrayList<String>> getProviderMapByCourse()
    {
        HashMap<String,ArrayList<String>> hmap = new HashMap<>();
        HashSet<String> hs = new HashSet<>();

        ListIterator itr = courseList.listIterator();
        while(itr.hasNext())
        {
            Course c = (Course)itr.next();
            hs.add(c.getCourseName());

        }
        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            String setcoursename  = (String)it.next();
            Iterator itplist  = tpList.iterator();
            while(itplist.hasNext())
            {
                TrainingProvider tp =(TrainingProvider)itplist.next();
                Iterator ilist = tp.getCourses().iterator();
                while(ilist.hasNext())
                {
                    String listcoursename  = (String)ilist.next();
                    if(listcoursename.equalsIgnoreCase(setcoursename))
                    {

                        if(hmap.containsKey(setcoursename))
                        {
                            hmap.get(setcoursename).add(tp.getName());
                        }
                        else{
                            ArrayList<String> trainingProviderName  = new ArrayList<>();
                            trainingProviderName.add(tp.getName());
                            hmap.put(setcoursename,trainingProviderName);
                        }



                    }
                }
            }

        }

        return hmap;

    }
}
