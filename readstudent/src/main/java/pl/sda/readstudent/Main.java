package pl.sda.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static ObjectMapper mapper =new ObjectMapper();

    public static void main(String[] args) {

        try {
            Student[] studentTab = mapper.readValue(new File("studentList.json"),Student[].class);
            List<Student> studentTabRead = Arrays.asList(studentTab);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Student [] studentTab = mapper.readValue(new File("studentList.json"), Student[].class);
            List<Student> studentTabRead = Arrays.asList(studentTab);
            studentTabRead.stream()
                    .filter(x -> x.getName().startsWith("A"))
                    .forEach(x -> System.out.println(x));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


