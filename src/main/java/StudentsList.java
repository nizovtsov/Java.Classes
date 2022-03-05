import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    private List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void printAllStudents() {
        for (Student student : studentsList) {
            System.out.println(student.toString());
        }
    }

    public void printFaculty(String faculty) {
        System.out.println("Список студентов факультета " + faculty);
        for (Student student : studentsList) {
            if (student.getFaculty().equals(faculty))
                System.out.println(student.toString());
        }
    }

    public void printGroup(String group) {
        System.out.println("Список студентов группы " + group);
        for (Student student : studentsList) {
            if (student.getGroup().equals(group))
                System.out.println(student.toString());
        }
    }

    public void printBirthYear(String year) {
        System.out.println("Список студентов родившихся после " + year + " года");
        for (Student student : studentsList){
            if(convertYearToInt(student.getDateOfBirth().substring(6))>convertYearToInt(year))
            System.out.println(student.toString());
        }
    }

    private int convertYearToInt(String year) {
        return Integer.parseInt(year);
    }

    public void printFacultyCourse(String faculty, int course) {
        System.out.println("Список студентов факультета " + faculty + " и курса " + course);
        for (Student student : studentsList) {
            if (student.getFaculty().equals(faculty) && student.getCourse() == course)
                System.out.println(student.toString());
        }
    }
}
