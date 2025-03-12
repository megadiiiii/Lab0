/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05_2;
import java.util.ArrayList
/**
 *
 * @author Mega.D
 */
public class Class {
    private String name;
    private ArrayList<Student> studentList;
    private int numOfStudents;
    private Teacher advisor;
   
    public Class(String name, Teacher advisor) {
       this.name = name;
       this.advisor = advisor;
       this.studentList = new ArrayList<>();
       this.numOfStudents = 0;
    }
   
    public String getName() {
        return name;
    }
    
    public void addStudent(Student student){
        studentList.add(student);
        student.setClass(this);
    }
    
    public void printList(){
        System.out.println("Student List");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
