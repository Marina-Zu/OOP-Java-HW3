package controller;


import data.GroupStream;
import data.StudentGroup;
import service.*;

import java.util.List;


public class Controller {

    private final DataService groupService;
    private final GroupStreamService groupStreamService;


    public Controller(DataService groupService, GroupStreamService groupStreamService) {
        this.groupService = groupService;
        this.groupStreamService = groupStreamService;
    }

    public StudentGroup createGroup(int groupNumber) {
        return groupService.getGroup(groupNumber);
    }

    public void streamListSort(List<GroupStream> groupStream) {
        groupStreamService.streamSort(groupStream);
    }
}







