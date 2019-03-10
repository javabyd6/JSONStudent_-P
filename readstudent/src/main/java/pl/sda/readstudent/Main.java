package pl.sda.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static ObjectMapper mapper =new ObjectMapper();

    public static void readStudentList(){

        try {
            Student[] studentTab = mapper.readValue(new File("studentList.json"),Student[].class);
            List<Student> studentTabRead = Arrays.asList(studentTab);
            System.out.println(studentTabRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void startingChar (String letter){

        try {
            Student [] studentTab = mapper.readValue(new File("studentList.json"), Student[].class);
            List<Student> studentTabRead = Arrays.asList(studentTab);
            studentTabRead.stream()
                    .filter(x -> x.getName().startsWith(letter))
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readStudentList();
        startingChar("A");

    }
}

