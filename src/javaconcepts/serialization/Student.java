package src.javaconcepts.serialization;

import java.io.Serializable;
/*Serialization is the process of storing object data in the form of bytes.
The data converted can be stored in a file or transmitted over network.
This is very useful and important to save users data and retrieve at a later time.
Serialization can be achieved using two interfaces - Serializable and Externalizable.*/

/*
Serializable is a marker interface and so it does not have any methods.
A class can be serialized if we simply implement this interface
*/
public class Student implements Serializable {

    private String name;
    private int rollNUmber;
    private char section;
    private Address address;

    //Any variables which are declared as static or transient will not be serialized.
    // Which means the value of those variables will be lost if we serialize and de-serialize.
    // For e.g., below the values of allStudentsCount and percentage will be lost and they will set to their default values 0 and 0.0
    // after the serialization/de-serialization.

    private static int allStudents;  // WON'T BE SERIALIZED
    private transient double percentage; // WON'T BE SERIALIZED

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNUmber(int rollNUmber) {
        this.rollNUmber = rollNUmber;
    }

    public int getRollNUmber() {
        return rollNUmber;
    }

    public void setSection(char section) {
        this.section = section;
    }

   /* public Student(String name, int rollNUmber, char section) {
        this.name = name;
        this.rollNUmber = rollNUmber;
        this.section = section;
    }*/

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNUmber=" + rollNUmber +
                ", section=" + section +
                ", address=" + address +
                '}';
    }
}
