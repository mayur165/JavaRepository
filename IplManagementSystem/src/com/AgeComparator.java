package com;

import java.util.Comparator;

public class AgeComparator implements Comparator {

    @Override
    public int compare(Object o1,Object o2)
    {
        Player p1 =(Player)o1;
        Player p2 =(Player)o2;

        if(p1.getAge()>p2.getAge())
        {
            return 1;
        }
        else if(p1.getAge()<p2.getAge())
        {
            return -1;
        }
        else {
            return 0;
        }
    }
}
