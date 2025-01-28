package singlelinkedlist.studentrecordmanagement;

// Creating Student class
public class Student {
     // Attributes
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    // Creating Constructor
    public Student(int rollNumber, String name, int age, char grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
