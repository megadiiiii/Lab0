/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05_2;

/**
 *
 * @author Mega.D
 */
public class Person {
    private String name;
    private String address;
    private String department;
    
    public Person() {}
    public Person(String name, String address, String department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Name: " + getName() + ", Address: " + getAddress() + ", Department: " + getDepartment();
    }
}
