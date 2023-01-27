package repository;

import data.Teacher;

public class DekanRepository extends TeacherRepository{
    @Override
    public Teacher save(Teacher entity) {
        if (Integer.parseInt(entity.getKafedra()) > 10) {
            return super.save(entity);
        }
        return null;
    }

}
