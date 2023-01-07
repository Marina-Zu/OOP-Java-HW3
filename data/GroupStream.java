package data;

import data.iterator.GroupStreamIterator;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup> {

    private List<StudentGroup> groupStream;

    public GroupStream(List<StudentGroup> groupStream) {
        this.groupStream = groupStream;
    }

    public List<StudentGroup> getGroupStream() {
        return groupStream;
    }

    public void setGroupStream(List<StudentGroup> groupStream) {
        this.groupStream = groupStream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this.groupStream);
    }

}
