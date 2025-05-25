import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Student {

    public String getName() {
        return name;
    }

    private String name;
    private String group;
    private int course;
    private List<Integer> marks;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, String group, int course, List<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public double getAverageMark() {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}
