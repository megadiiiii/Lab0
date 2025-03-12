/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05_2;

/**
 *
 * @author Mega.D
 */
public class Student extends Person{
    private String studentID;
    private double gpa;
    
    public Student() {}
    public Student(String name, String address, String department, String studentID, double gpa) {
        super(name, address, department);
        this.gpa = gpa;
        this.studentID = studentID;
    }
    
    public String getStudentID() {
        return studentID;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + getStudentID() + ", GPA: " + getGpa();
    }
}
