package singlelinkedlist.socialmediafriendconnection;

// Creating User Node
public class UserNode {
    // Attributes
    int userID;
    String name;
    int age;
    FriendNode friendList;
    UserNode next;

    // Creating Constructor
    public UserNode(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendList = null;
        this.next = null;
    }
}
