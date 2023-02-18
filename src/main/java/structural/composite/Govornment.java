package main.java.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Govornment implements School{
    private List<School> schoolList;

    Govornment(){
        schoolList = new ArrayList<>();
    }

    @Override
    public void studyStudents() {
        schoolList.forEach(school -> school.studyStudents());
    }

    public void addSchool(School school){
        schoolList.add(school);
    }

    public void removeSchool(School school){
        schoolList.remove(school);
    }
}
