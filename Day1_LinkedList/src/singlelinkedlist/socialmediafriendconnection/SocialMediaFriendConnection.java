package singlelinkedlist.socialmediafriendconnection;

// Creating Class name SocialMediaFriendConnection
public class SocialMediaFriendConnection {
    UserNode head;

    // Creating Constructor
    public SocialMediaFriendConnection() {
        this.head = null;
    }

    // Method to add the user
    public void addUser(int userID, String name, int age) {
        UserNode newUser = new UserNode(userID, name, age);
        newUser.next = head;
        head = newUser;
    }
    // Add a friend connection between two users
    public void addFriend(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            addFriendToUser(user1, userID2);
            addFriendToUser(user2, userID1);
        }
    }

    private void addFriendToUser(UserNode user, int friendID) {
        FriendNode newFriend = new FriendNode(friendID);
        newFriend.next = user.friendList;
        user.friendList = newFriend;
    }
    // Remove a friend connection
    public void removeFriend(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            user1.friendList = removeFriendFromList(user1.friendList, userID2);
            user2.friendList = removeFriendFromList(user2.friendList, userID1);
        }
    }

    private FriendNode removeFriendFromList(FriendNode friendList, int friendID) {
        if (friendList == null) {
            return null;
        }
        if (friendList.friendID == friendID) {
            return friendList.next;
        }
        FriendNode cur = friendList;
        while (cur.next != null && cur.next.friendID != friendID) {
            cur = cur.next;
        }
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
        return friendList;
    }
    // Search for a user by Name or User ID
    public UserNode findUserByID(int userID) {
        UserNode cur = head;
        while (cur != null && cur.userID != userID) {
            cur = cur.next;
        }
        return cur;
    }
    // Display all friends of a specific user
    public void displayFriends(int userID) {
        UserNode user = findUserByID(userID);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            FriendNode friend = user.friendList;
            while (friend != null) {
                UserNode friendUser = findUserByID(friend.friendID);
                if (friendUser != null) {
                    System.out.println("ID: " + friendUser.userID + ", Name: " + friendUser.name + ", Age: " + friendUser.age);
                }
                friend = friend.next;
            }
        }
    }



    public UserNode findUserByName(String name) {
        UserNode cur = head;
        while (cur != null && !cur.name.equals(name)) {
            cur = cur.next;
        }
        return cur;
    }

    public int countFriends(int userID) {
        UserNode user = findUserByID(userID);
        int count = 0;
        if (user != null) {
            FriendNode friend = user.friendList;
            while (friend != null) {
                count++;
                friend = friend.next;
            }
        }
        return count;
    }

    // Creating Main Method
    public static void main(String[] args) {
        SocialMediaFriendConnection ob = new SocialMediaFriendConnection();
        ob.addUser(1, "Abhishek", 25);
        ob.addUser(2, "Neeraj", 22);
        ob.addUser(3, "Rajan", 23);

        ob.addFriend(1, 2);
        ob.addFriend(1, 3);

        ob.displayFriends(1);
        ob.displayFriends(2);


        ob.removeFriend(1, 2);
        ob.displayFriends(1);
        ob.displayFriends(2);
    }
}
