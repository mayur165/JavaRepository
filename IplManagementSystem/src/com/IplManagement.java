package com;

import java.util.*;
import java.util.stream.Collectors;

public class IplManagement implements IplMgmtsystemInf {
    static List<Team> teamList = new ArrayList<Team>();
    static List<Player> playerList = new ArrayList<>();

    @Override
    public int addteam(Team t) {
        boolean check = false;
        if (teamList.size() > 0) {
            Iterator itr = teamList.iterator();
            while (itr.hasNext()) {
                Team tnew = (Team) itr.next();
                if (tnew.getRegion().equalsIgnoreCase(t.getRegion())) {
                    return -2;
                } else {
                    check = true;
                }
            }

        } else {
            teamList.add(t);
            return teamList.size();
        }
        if (check) {
            teamList.add(t);
        }
        return teamList.size();

    }

    @Override
    public int addPlayer(Player p) {
        boolean playercheck = false;
        int count = 0;
        if (teamList.size() > 0) {
            Iterator it = teamList.iterator();
            while (it.hasNext()) {
                Team team = (Team) it.next();
                if (team.getPlayers() != null) {
                    Iterator itr = team.getPlayers().iterator();
                    while (itr.hasNext()) {
                        Player pt = (Player) itr.next();
                        if (pt.getName().equalsIgnoreCase(p.getName())) {
                            return -2;
                        } else {
                            playercheck = true;
                        }
                    }
                } else {
                    playerList.add(p);
                    team.setPlayers(playerList);
                    teamList.set(count, team);
                    return playerList.size();
                }
                if (playercheck) {
                    playerList.add(p);
                    team.setPlayers(playerList);
                    teamList.set(count, team);
                    count++;
                    return playerList.size();
                }
            }
        } else {
            System.out.println("Sorry no teams are there, first add the team and then players");
        }

        return playerList.size();
    }

    @Override
    public Set<String> getCaptainName() {
        Set<String> captainSet = new HashSet<>();
        String role = "Captain";
        Iterator ito = teamList.iterator();
        while (ito.hasNext()) {
            Team tm = (Team) ito.next();
            if (tm.getPlayers() != null) {
                Iterator itr = tm.getPlayers().iterator();
                while (itr.hasNext()) {
                    Player pp = (Player) itr.next();
                    if (pp.getRole().equalsIgnoreCase(role)) {
                        captainSet.add(pp.getName());
                    }
                }
            }
        }
        return captainSet;
    }

    @Override
    public Map<Integer, Player> getPlayerMapByRegion(String name) {
        Map<Integer, Player> playerMap = new HashMap<>();
        Iterator ito = teamList.iterator();
        while (ito.hasNext()) {
            Team tm = (Team) ito.next();
            if (tm.getPlayers() != null) {
                Iterator itr = tm.getPlayers().iterator();
                while (itr.hasNext()) {
                    Player pp = (Player) itr.next();
                    if (tm.getRegion().equalsIgnoreCase(name)) {
                        playerMap.put(pp.getShirt_no(), pp);
                    }
                }
            }
        }
//playerMap = teamList.stream().filter(i->i.getPlayers()!=null).forEach(j->playerMap.put(j.getPlayers().get(0).getShirt_no(),j);
        return playerMap;
    }

    @Override
    public TreeSet<Player> getPlayerSortedByAge() {
        TreeSet<Player> setPlayer = new TreeSet<>(new AgeComparator());
        Iterator it = teamList.iterator();
        while (it.hasNext()) {
            Team tm = (Team) it.next();
            if (tm.getPlayers() != null) {
                Iterator itr = tm.getPlayers().iterator();
                while (itr.hasNext()) {
                    Player pp = (Player) itr.next();
                    setPlayer.add(pp);
                }
            }

        }
        return setPlayer;
    }
}
