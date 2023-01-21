package repository;


import data.StudentGroup;

/**
 * - Создать класс GroupRepository, имплементировав его от Repository
 */

public class GroupRepository implements Repository<StudentGroup, Integer> {


    @Override
    public StudentGroup save(StudentGroup entity) {
        return null;
    }

    @Override
    public StudentGroup findById(Integer id) {
        return null;
    }
}
