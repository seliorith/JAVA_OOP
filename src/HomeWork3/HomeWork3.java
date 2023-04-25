package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * К коду с семинара добаить класс Teacher и возможность итерации и компорации
 * для него. Так же для учебной группы добавить преподавателя(У группы может
 * быть только один преподаватель, у проподавателя сколько угодно групп)
 **/

public class HomeWork3 {
    public static void main(String[] args) {

        Teacher teacher01 = new Teacher("Златьева", "Виктория");
        Teacher teacher02 = new Teacher("Бородина", "Татьяна");

        StudentGroup StudentGroup01 = new StudentGroup("Group01", 0, teacher01);
        StudentGroup StudentGroup02 = new StudentGroup("Group02", 1, teacher02);
        StudentGroup StudentGroup03 = new StudentGroup("Group03", 2, teacher02);

        List<Human> students = new ArrayList<Human>();
        students.add(new Student("Петр", "Петров", 5));
        students.add(new Student("Иван", "Иванов", 4));
        students.add(new Student("Сидор", "Сидоров", 3));

        Collections.sort(students, new StudentComporator());
        HumanListIterator studentListIter = new HumanListIterator(students);
        while (studentListIter.hasNext()) {
            System.out.println(studentListIter.next());
        }

        List<Human> teacherList = new ArrayList<Human>();
        teacherList.add(teacher01);
        teacherList.add(teacher02);

        Collections.sort(teacherList, new TeacherComporator());
        HumanListIterator teacherListIter = new HumanListIterator(teacherList);
        while (teacherListIter.hasNext()) {
            System.out.println(teacherListIter.next());
        }
    }
}
