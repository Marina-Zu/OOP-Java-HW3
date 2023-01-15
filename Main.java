import data.Student;
import data.comparator.UserComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> sortStudents = Arrays.asList(
                new Student("Poul", 18, 123, "Mathematics",5),
                new Student("Kris", 18, 456, "Mathematics", 6),
                new Student("Jack", 19, 789, "Physics",5)
        );

        System.out.println(sortStudents);

        Collections.sort(sortStudents, new UserComparator());
        System.out.println(sortStudents);
    }
//    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(5);
//        integerList.add(1);
//        integerList.add(3);
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Hello");
//        stringList.add("from");
//        stringList.add("java");
//
//        System.out.println(integerList);
//        System.out.println(stringList);
//
//
//        integerList = orderList(integerList);
//        stringList = orderList(stringList);
//
//        System.out.println(integerList);
//        System.out.println(stringList);
//    }
//
//    private static <T extends Comparable<T>> List<T> orderList(List<T> list){
//        Collections.sort(list);
//        return list;
//    }

}
