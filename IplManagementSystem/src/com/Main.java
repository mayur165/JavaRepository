package com;

public class Main {
    public static void main(String[] args) {
        Team t = new Team("Delhi","Delhi Daredevils","Sun Networks","Manish Agrawal");
        Team t1 = new Team("Mumbai","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t2 = new Team("Delhi","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t3 = new Team("Delhi","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t4 = new Team("Delhi","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t5 = new Team("Delhi","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t6 = new Team("chhatarpur","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t7 = new Team("Delhi","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t8 = new Team("Delhi","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t9 = new Team("Delhi","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t10 = new Team("Delhi","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Team t11 = new Team("delhi","Mumbai Indians","Reliance Industry","Mukesh Ambani");
        Player p = new Player("Rahane",39,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p1 = new Player("Dhoni",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","Captain");
        Player p2 = new Player("Dinesh",12,24,"Delhi Daredevils","India","Right Handed","Not Applicable","Captain");

        Player p3 = new Player("Saghvi",24,24,"Delhi Daredevils","India","Right Handed","Not Applicable","Captain");
        Player p4 = new Player("Dhoni",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p5 = new Player("Dhoni",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p6 = new Player("Dhoni",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p7 = new Player("Dhoni",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p8 = new Player("Akshay",2,24,"Delhi Daredevils","India","Right Handed","Not Applicable","Captain");
        Player p9 = new Player("Dhoni",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p10 = new Player("Singham",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p11 = new Player("Dhoni",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p12 = new Player("Sandeep",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p13 = new Player("Dhoni",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        Player p14 = new Player("Dhoni",22,24,"Delhi Daredevils","India","Right Handed","Not Applicable","WicketKeeper");
        IplManagement i = new IplManagement();

        Team[] teamArray =  new Team[]{t,t1};//t2,t3,t4,t5,t6,t7,t8,t9,t10,t11};
        for(Team k:teamArray)
        {
            System.out.println(i.addteam(k));
        }
        Player[] playerArray = new Player[]{p,p1,p2,p3,/*p4,p5,p6,p7*/p8};//,p9,p10,p11,p12,p13,p14};
        for(Player pp:playerArray)
        {
            System.out.println(i.addPlayer(pp));
        }
        System.out.println(i.getCaptainName());
        System.out.println(i.getPlayerMapByRegion("delhi"));
        System.out.println(i.getPlayerSortedByAge());
    }
}
