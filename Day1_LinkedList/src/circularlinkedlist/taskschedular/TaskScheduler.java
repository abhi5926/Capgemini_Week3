package circularlinkedlist.taskschedular;

public class TaskScheduler {
     Task head;
     Task current;

     // Ctreating Constructor
     public TaskScheduler() {
         this.head = null;
         this.current = null;
     }
    // Add task at the beginning
    public void addTaskAtBeginning(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newTask.next = head;
            head = newTask;
            temp.next = head;
        }
    }

    // Add task at the end
    public void addTaskAtEnd(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Add task at a specific position
    public void addTaskAtPosition(int taskID, String taskName, int priority, String dueDate, int position) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (position == 1) {
            addTaskAtBeginning(taskID, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Remove task by Task ID
    public void removeTaskByID(int taskID) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        if (head.taskID == taskID) {
            if (head.next == head) {
                head = null;
            } else {
                Task temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                head = head.next;
                temp.next = head;
            }
            return;
        }
        Task current = head;
        while (current.next != head && current.next.taskID != taskID) {
            current = current.next;
        }
        if (current.next.taskID == taskID) {
            current.next = current.next.next;
        }
    }

    // View the current task and move to the next task
    public void viewCurrentTaskAndMoveToNext() {
        if (current == null) {
            current = head;
        }
        if (current != null) {
            System.out.println("Current Task: ID: " + current.taskID + ", Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } else {
            System.out.println("Task list is empty");
        }
    }

    // Display all tasks starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        Task temp = head;
        do {
            System.out.println("ID: " + temp.taskID + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

     // Creating Main Method
    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTaskAtBeginning(1, "Task1", 2, "2025-01-30");
        ts.addTaskAtEnd(2, "Task2", 1, "2025-02-10");
        ts.addTaskAtPosition(3, "Task3", 3, "2025-03-15", 2);
        ts.displayAllTasks();
        ts.viewCurrentTaskAndMoveToNext();
        ts.viewCurrentTaskAndMoveToNext();
        ts.viewCurrentTaskAndMoveToNext();

        ts.removeTaskByID(2);
        ts.displayAllTasks();
    }
}
