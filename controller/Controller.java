package controller;


import data.GroupStream;
import data.StudentGroup;
import data.comparator.GroupStreamComparator;
import service.DataServiceGroup;
import service.StudentGroupServiceImpl;
import service.StudentServiceImpl;

import java.util.Comparator;
import java.util.List;


public class Controller {

    private DataServiceGroup studentGroup;
    private StudentServiceImpl studentService;
    private StudentGroupServiceImpl sortStudents;
    private GroupStream groupStream;

    public Controller(DataServiceGroup studentGroup, StudentServiceImpl studentService,
                      StudentGroupServiceImpl sortStudents, GroupStream groupStream) {
        this.studentGroup = studentGroup;
        this.studentService = studentService;
        this.sortStudents = sortStudents;
        this.groupStream = groupStream;
    }

//    public void sortStream(List<GroupStream> groupStream) {
//        groupStream.sort();
//    }


}






