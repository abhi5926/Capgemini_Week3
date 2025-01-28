package circularlinkedlist.roundrobinschedulingalgorithm;

// Creating Class
public class RoundRobinScheduling {
     Process head;
     Process tail;
     int timeQuantum;

     // Creating Constructor
     public RoundRobinScheduling(int timeQuantum) {
         this.head = null;
         this.tail = null;
         this.timeQuantum = timeQuantum;
     }

    // Add a new process at the end
    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
    }
    // Remove a process by Process ID
    public void removeProcess(int processID) {
        if (head == null) {
            return;
        }
        if (head.processID == processID) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            return;
        }
        Process current = head;
        while (current.next != head && current.next.processID != processID) {
            current = current.next;
        }
        if (current.next.processID == processID) {
            current.next = current.next.next;
            if (current.next == head) {
                tail = current;
            }
        }
    }

    // Simulate the round-robin scheduling
    public void simulate() {
        if (head == null) {
            System.out.println("No processes in the queue");
            return;
        }

        Process current = head;
        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = 0;

        while (true) {
            boolean done = true;
            Process temp = current;

            do {
                if (temp.remainingTime > 0) {
                    done = false;
                    if (temp.remainingTime > timeQuantum) {
                        time += timeQuantum;
                        temp.remainingTime -= timeQuantum;
                    } else {
                        time += temp.remainingTime;
                        temp.remainingTime = 0;
                        int turnaroundTime = time;
                        int waitingTime = turnaroundTime - temp.burstTime;
                        totalTurnaroundTime += turnaroundTime;
                        totalWaitingTime += waitingTime;
                        processCount++;
                        removeProcess(temp.processID);
                    }
                    System.out.println("Process ID: " + temp.processID + ", Remaining Time: " + temp.remainingTime);
                }
                temp = temp.next;
            } while (temp != current);

            if (done) {
                break;
            }
        }
        double averageWaitingTime = (double) totalWaitingTime / processCount;
        double averageTurnaroundTime = (double) totalTurnaroundTime / processCount;
        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
    }
    // Display the list of processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue");
            return;
        }
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processID + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority + ", Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }
    // Creating Main Method
    public static void main(String[] args) {
        RoundRobinScheduling ob = new RoundRobinScheduling(4);
        ob.addProcess(1, 10, 1);
        ob.addProcess(2, 5, 2);
        ob.addProcess(3, 8, 1);
        ob.displayProcesses();
        ob.simulate();
        ob.displayProcesses();
    }
}
