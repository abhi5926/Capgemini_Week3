package circularlinkedlist.roundrobinschedulingalgorithm;

// Creating class Name as Process
public class Process {
    // Attributes
    int processID;
    int burstTime;
    int priority;
    int remainingTime;
    Process next;

    // Creating Constructor
    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
