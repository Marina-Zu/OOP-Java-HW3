package data.comparator;

import data.Student;
import data.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {

        return (user1.getFio().compareTo(user2.getFio()));
    }

}
