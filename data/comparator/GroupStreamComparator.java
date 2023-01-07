package data.comparator;

import data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream groupStream1, GroupStream groupStream2) {
        int sizeGroupStream1 = groupStream1.getGroupStream().size();
        int sizeGroupStream2 = groupStream2.getGroupStream().size();
        return Integer.compare(sizeGroupStream1, sizeGroupStream2);
    }
}
