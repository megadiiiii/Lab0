/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05_2;

/**
 *
 * @author Mega.D
 */
public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Dr. Le Van C", "Hà Nội", "Software Engineering", "TS");
        Teacher teacher2 = new Teacher("ThS. Hoang Minh D", "TP.HCM", "Data Science", "ThS");
        
        Class classA = new Class("Class A", teacher1);
        Class classB = new Class("Class B", teacher2);
        
        Student student1 = new Student("Nguyen Van A", "Hà Nội", "Information Systems", "SV001", 3.5);
        Student student2 = new Student("Tran Thi B", "Đà Nẵng", "Computer Science", "SV002", 3.8);
        
        classA.addStudent(student1);
        classB.addStudent(student2);
        
        teacher1.addStudent(student1);
        teacher2.addStudent(student2);
        
        System.out.println("\n--- Thông tin giáo viên ---");
        System.out.println(teacher1);
        System.out.println(teacher2);
        
        classA.printList();
        classB.printList();
    }
}
