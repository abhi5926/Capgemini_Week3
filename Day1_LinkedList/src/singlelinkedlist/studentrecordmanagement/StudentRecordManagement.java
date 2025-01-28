package singlelinkedlist.studentrecordmanagement;

// Creating Main class
public class StudentRecordManagement {
    // Creating head
    Student head;

    // Creating Constructor
    public StudentRecordManagement(){
        this.head = null;
    }

    // Add the Student at Beginning
    public void addAtBeginning(int rollNumber, String name, int age, char grade){
        Student newNode = new Student(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }
    // Add Student at end
    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        Student newNode = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
        } else {
            Student cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
    }
        // Method to add a Student at a Specific position
        public void addAtPosition ( int rollNumber, String name,int age, char grade, int position){
            Student newNode = new Student(rollNumber, name, age, grade);
            if (position == 1) {
                newNode.next = head;
                head = newNode;
            }
            Student cur = head;
            for (int i = 0; i < position - 1; i++) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
        // Method to delete Student Record by roll Number
        public void deleteStudentByRollNumber (int rollNumber){
            if (head == null) {
                System.out.println("List is Empty :");
            }
            if (head.rollNumber == rollNumber) {
                head = head.next;
            }
            Student cur = head;
            while (cur.next != null && cur.next.rollNumber != rollNumber) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    // Search Student Record By RollNumber
    public Student saerchStudentByRollNumber(int rollNumber){
        Student cur = head;
        while(cur != null && cur.rollNumber != rollNumber){
            cur = cur.next;
        }
        return cur;
    }
    // Method to display all the record
    public void display(){
        Student cur = head;
        while(cur != null){
            System.out.println("Roll Number: " + cur.rollNumber + ", Name: " + cur.name + ", Age: " + cur.age + ", Grade: " + cur.grade);
            cur = cur.next;
        }
    }

    // Method to Update Student grade
    public void updateStudentGrade(int rollNumber,char newGrade){
        Student cur = head;
        while(cur != null && cur.rollNumber != rollNumber){
            cur =cur.next;
        }
        cur.grade = newGrade;
    }


}
