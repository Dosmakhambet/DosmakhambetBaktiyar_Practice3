package main.java.structural.composite;

public class Main {
    public static void main(String args[]){
        Govornment govornment = new Govornment();

        govornment.addSchool(new BIL());
        govornment.addSchool(new FIZMAT());
        govornment.addSchool(new NIS());

        govornment.studyStudents();
    }
}
