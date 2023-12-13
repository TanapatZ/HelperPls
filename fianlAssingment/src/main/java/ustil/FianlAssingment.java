/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ustil;

import java.util.Arrays;
import work1.Student;

/**
 *
 * @author tanapatkrowattanajaroenkit
 */
public class FianlAssingment {
    
    public static void main(String[] args) {
        int count = 1;
//        Student s = new Student(5, "one", 10.0);
//        System.out.println(s);
        System.out.println(count++ + "Student  " + new Student(count, "one", 10.0));
        System.out.println(count++ + "Student  " + new Student(count, "two", 20.0));
        System.out.println(count++ + "Student  " + new Student(count, "three", 30.0));
        System.out.println(count++ + "Student  " + new Student(count, "four", 40.0));
        System.out.println(count++ + "Student  " + new Student(count, "five", 50.0));
        System.out.println(count++ + "Student  " + new Student(count, "six", 50.0));
        System.out.println(count++ + "Student  " + new Student(count, "seven", 80.0));
        System.out.println(count++ + "Student  " + new Student(20, "20", 80.0));
        System.out.println(count++ + "Student  " + new Student(10, "10", 80.0));
        System.out.println("remove" + Student.remove(4));
        Student.sort();
        System.out.println(Student.listall());
        Student.search("two");
    }
}
