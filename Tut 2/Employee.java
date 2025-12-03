/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Employee extends Person {
    // imaginary constructor calls superclass constructor
    // constructor --> calls parent constructor but the parent requires args
    private int empID;
    public Employee(String name, String gender){
     super(name, gender);
     empID = 0;
    }
    public Employee(int empID, String name, String gender){
     super(name,gender);
     this. empID = empID;
    }
    public String toString(){ //overiding 
       return "Employee ID : " + empID + "Employee name : " + getName() + "Employee Gender: " + getGender();
    }
}
