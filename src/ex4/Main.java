package ex4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Group> groups = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Student> deduction = new ArrayList<>();
        Group group1 = new Group();

        Student student1 = new Student();
        student1.setName("Maks");
        student1.setPin(123);
        student1.setMarks(new ArrayList<>());
        student1.getMarks().add(49);
        student1.getMarks().add(61);
        student1.getMarks().add(9);

        Student student2 = new Student();
        student2.setName("Al");
        student2.setPin(321);
        student2.setMarks(new ArrayList<>());
        student2.getMarks().add(20);
        student2.getMarks().add(21);
        student2.getMarks().add(38);

        group1.setGroupName("Name №1");
        group1.setCourse(2);
        group1.setGroupNumber(1);
        group1.setStudents(new ArrayList<>());
        group1.getStudents().add(student1);

        students.add(student1);
        students.add(student2);

        groups.add(group1);
        System.out.println(groups);

        //добавление студента в группу по номеру группы и объекту
        for (int i = 0; i < groups.size(); i ++){
            if (groups.get(i).getGroupNumber() == 1){
                group1.getStudents().add(student2);
            } else {
                System.out.println("The group not found");
            }
        }
        System.out.println(groups);


        //удаление студента
        for (int i = 0; i < groups.size(); i ++){
            if (groups.get(i).getGroupNumber() == 1 && group1.getStudents().contains(student2)){
                groups.get(i).getStudents().remove(student2);

            }
        }
        System.out.println(groups);



        //удаление и запись в файл
        for (int i = 0; i < groups.size(); i ++){
            int course = groups.get(i).getCourse();
            groups.get(i).setCourse(course + 1);
            if (students.get(i).countAvg() < 61){
                groups.get(i).getStudents().remove(students.get(i));
                deduction.add(students.get(i));
            }
        }

        File file = new File("///home/lenovo/file.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(String.valueOf(deduction));
            fileWriter.close();
            FileReader fileReader = new FileReader(file);
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        for (int i = 0; i < groups.size(); i ++){
            double meanScore = 0;
            meanScore += students.get(i).countAvg() / students.size();
            System.out.println(meanScore);
        }

        System.out.println(groups);
        System.out.println(deduction);
    }

}
