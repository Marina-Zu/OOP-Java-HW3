package controller;


import data.StudentGroup;
import service.DataServiceGroup;


public class Controller {

    private DataServiceGroup studentGroup;

    public Controller(DataServiceGroup studentGroupSService) {
        this.studentGroup = studentGroupSService;
    }

    public StudentGroup createGroup(int groupNumber){
        return studentGroup.getGroup(groupNumber);
    }

}






