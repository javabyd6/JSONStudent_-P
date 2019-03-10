package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static ObjectMapper mapper = new ObjectMapper();
    public static void saveStudentList(){

        Student student1 = new Student("Jan","Andrzejewski",111);
        Student student2 = new Student("Andrzej","Kowalski",222);
        Student student3 = new Student("Piotr","Nowak",333);
        Student student4 = new Student("Tomasz","Tomaszewski",444);
        Student student5 = new Student("Adam","Polak",555);

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        try {
            mapper.writeValue(new File("studentList.json"),studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        saveStudentList();
    }
}
