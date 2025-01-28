package circularlinkedlist.taskschedular;

// Creating class as a Node
public class Task {
    // Attributes
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    // Creating Constructor
    public Task(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
