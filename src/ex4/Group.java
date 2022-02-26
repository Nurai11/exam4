package ex4;

import java.util.List;
import java.util.Objects;

public class Group {
    private String groupName;
    private int course;
    private int groupNumber;
    private List<Student> students;



    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return course == group.course && groupNumber == group.groupNumber && Objects.equals(groupName, group.groupName) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, course, groupNumber, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", course=" + course +
                ", groupNumber=" + groupNumber +
                ", students=" + students +
                '}';
    }
}
