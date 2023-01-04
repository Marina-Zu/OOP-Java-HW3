/*Создать класс StudentGroupServiceImpl,
в котором реализована логика чтения Студентов и Преподавателя из файла txt
(реализация чтения файла опциональна), создания класса StudentGroup и возвращения его.
*/

package service;

import data.StudentGroup;
import util.ReaderFromTxt;

public class StudentGroupServiceImpl implements DataServiceGroup {
      @Override
    public StudentGroup getGroup(int number) {
        return new StudentGroup(ReaderFromTxt.getTeacherFromTxt(), ReaderFromTxt.getStudentsFromTxt(), number);
    }

   }