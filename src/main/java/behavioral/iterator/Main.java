package main.java.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        FootBallTeam team = new FootBallTeam();

        team.addMember("Ronaldo");
        team.addMember("Messi");
        team.addMember("Ronaldinho");

        Iterator iterator = team.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
