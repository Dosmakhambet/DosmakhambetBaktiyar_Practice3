package main.java.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class FootBallTeam implements Team{
    List<String> team;

    public FootBallTeam() {
        this.team = new ArrayList<>();
    }

    public void addMember(String member){
        team.add(member);
    }

    public void deleteMember(String member){
        team.remove(member);
    }

    @Override
    public Iterator getIterator() {
        return new TeamIterator();
    }

    class TeamIterator implements Iterator{
        int n = 0;
        @Override
        public boolean hasNext() {
            if(n < team.size()){
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return team.get(n++);
            }

            return null;
        }
    }
}
