import java.util.*;

public class Main {

    private static final List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        students.add(new Student("Тони Старк", "I", 4, Arrays.asList(5, 5, 4, 5, 5)));
        students.add(new Student("Брюс Беннер", "I", 5, Arrays.asList(5, 5, 5, 5, 5)));
        students.add(new Student("Питер Паркер", "I", 1, Arrays.asList(5, 5, 5, 5, 5)));
        students.add(new Student("Уэйд Уилсон", "II", 2, Arrays.asList(1, 1, 1, 1, 1)));
        students.add(new Student("Наташа Романова", "III", 3, Arrays.asList(5, 5, 5, 5, 5)));
        students.add(new Student("Стив Роджерс", "IV", 3, Arrays.asList(4, 4, 4, 5, 4)));
        students.add(new Student("Логан", "V", 2, Arrays.asList(3, 3, 3, 3, 3)));
        students.add(new Student("Стивен Стрэндж", "V", 1, Arrays.asList(5, 5, 5, 5, 5)));
        students.add(new Student("Эдди Брок", "VI", 5, Arrays.asList(3, 4, 2, 3, 5)));
        students.add(new Student("Клетус Кэссиди", "VI", 4, Arrays.asList(2, 2, 2, 2, 2)));
        promoteStudents(students);
        removeStudentsWithLowAverages(students);
        printStudents(convertListToSet(students), 4);


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Додов", "8-999-785-5555");
        phoneBook.add("Козлов", "8-960-539-8888");
        phoneBook.add("Козлов", "8-905-134-0000");
        System.out.println("Номера с фамилией \"Додов\": " + phoneBook.get("Додов"));
        System.out.println("Номера с фамилией \"Козлов\": " + phoneBook.get("Козлов"));
        System.out.println(phoneBook.get("Комин"));
    }

    public static void promoteStudents(List<Student> students) {
        for (Student s : students) {
            if (s.getAverageMark() > 3 && s.getCourse() < 5) {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void removeStudentsWithLowAverages(List<Student> students) {
        students.removeIf(student -> {
            double averageMark = student.getAverageMark();
            return averageMark < 3;
        });
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Set<Student> convertListToSet(List<Student> students) {
        return new HashSet<>(students);
    }




}
