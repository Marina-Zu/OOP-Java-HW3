package data.iterator;

import data.StudentGroup;
import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroups;
    private int cursor;

    public GroupStreamIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public boolean hasNext() {
        return cursor < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroups.get(cursor--);
    }

    @Override
    public void remove() {
        this.studentGroups.remove(cursor);
    }

}
