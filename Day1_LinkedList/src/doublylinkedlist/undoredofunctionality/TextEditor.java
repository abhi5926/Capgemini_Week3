package doublylinkedlist.undoredofunctionality;

// Creating Main Class
public class TextEditor {
     TextState head;
     TextState tail;
     TextState current;
    int size;
     final int maxSize;

     // Creating Constructor
     public TextEditor(int maxSize) {
         this.head = null;
         this.tail = null;
         this.current = null;
         this.size = 0;
         this.maxSize = maxSize;
     }

    // Add a new text state at the end
    public void addTextState(String content) {
        TextState newState = new TextState(content);
        if (head == null) {
            head = newState;
            tail = newState;
            current = newState;
        } else {
            if (current != tail) {
                // Remove all states after the current state
                tail = current;
                current.next = null;
            }
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;
        }
        if (size == maxSize) {
            // Remove the oldest state
            head = head.next;
            head.prev = null;
        } else {
            size++;
        }
    }

    // Implement undo functionality (revert to the previous state)
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    // Implement redo functionality (revert back to the next state after undo)
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No current state available.");
        }
    }

    // Creating Main Method
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.addTextState("State 1");
        editor.addTextState("State 2");
        editor.addTextState("State 3");

        editor.displayCurrentState(); 

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addTextState("State 4");
        editor.displayCurrentState();
    }

    }
