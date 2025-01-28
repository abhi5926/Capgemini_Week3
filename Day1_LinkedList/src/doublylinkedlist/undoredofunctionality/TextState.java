package doublylinkedlist.undoredofunctionality;

// Creating Node
public class TextState {
    //Attributes
    String content;
    TextState prev;
    TextState next;

    // Creating Constructor
    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
