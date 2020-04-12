package com;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public interface IplMgmtsystemInf {

    int addteam(Team t);
    int addPlayer(Player p);
    Set<String> getCaptainName();
    Map<Integer,Player> getPlayerMapByRegion(String name);
    TreeSet<Player> getPlayerSortedByAge();


}
