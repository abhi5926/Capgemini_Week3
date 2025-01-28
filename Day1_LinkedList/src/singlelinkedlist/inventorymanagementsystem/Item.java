package singlelinkedlist.inventorymanagementsystem;

// Creating Node class
class Item {
    // Attributes
    String itemName;
    int itemID;
    int quantity;
    double price;
    Item next;

    // Craeting Constructor
    public Item(int itemID, String itemName, int quantity, double price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
