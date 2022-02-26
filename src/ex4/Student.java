package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private int pin;
    private String name;
    private List<Integer> marks = new ArrayList<>();

    public double countAvg(){
        double avg = 0;
        for (int i = 0; i < marks.size(); i ++){
            avg = avg + marks.get(i) / marks.size();
        }
        return avg;
    }


    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return pin == student.pin && Objects.equals(name, student.name) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin, name, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "pin=" + pin +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
