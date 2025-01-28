package singlelinkedlist.studentrecordmanagement;

//Creating Main Method
public class Main {
    public static void main(String[] args){
        // Creating Object
        StudentRecordManagement ob = new StudentRecordManagement();
        ob.addAtBeginning(1,"Abhishek",20,'A');
        ob.addAtBeginning(2,"Neeraj",21,'B');
        ob.addAtPosition(3,"Rajan",22,'B',2);
        ob.display();
        ob.updateStudentGrade(2,'C');
        ob.display();
        ob.deleteStudentByRollNumber(1);
        ob.display();
    }
}
