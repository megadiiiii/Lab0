/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05_2;

/**
 *
 * @author Mega.D
 */
public class Teacher extends Person{
    private String rank;
    
    
    public Teacher() {}
    public Teacher(String name, String address, String department, String rank) {
        super(name, address, department);
        this.rank = rank;
    }
    
    public String setRank() {
        return rank;
    }
    
    public void getRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Rank: " + getRank();
    }
}
