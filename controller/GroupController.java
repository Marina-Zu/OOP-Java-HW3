package controller;

import data.StudentGroup;
import repository.GroupRepository;

public class GroupController extends GroupRepository {
    private GroupController groupController;

    public GroupController(GroupController groupController) {
        this.groupController = groupController;
    }

    @Override
    public StudentGroup save(StudentGroup entity) {
        return groupController.save(entity);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return groupController.findById(id);
    }
}
