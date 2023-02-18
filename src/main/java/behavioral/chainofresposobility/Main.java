package main.java.behavioral.chainofresposobility;

public class Main {
    public static void main(String args[]){
        AbstractPerson employee = new Employee(100,"Ivan");
        AbstractPerson manager = new Manager(200, "Igor");
        AbstractPerson director = new Director(1000, "Georgy");
        employee.setNext(manager);
        manager.setNext(director);
        employee.doJob(50, "Phone");
        employee.doJob(150, "Chair");
        manager.doJob(250, "Computer");
        director.doJob(900, "Ring");

    }
}
