package singlelinkedlist.inventorymanagementsystem;

class InventoryManagement {
    Item head;

    // Creating Constructor
    public InventoryManagement() {
        this.head = null;
    }

    // Add Item At Beginning
    public void addItemAtBeginning(int itemID, String itemName, int quantity, double price) {
        Item newItem = new Item(itemID, itemName, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Method to add Item at End
    public void addItemAtEnd(int itemID, String itemName, int quantity, double price) {
        Item newItem = new Item(itemID, itemName, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    // Method to add at a Specific position
    public void addItemAtPosition(int itemID, String itemName, int quantity, double price, int position) {
        Item newItem = new Item(itemID, itemName, quantity, price);
        if (position == 1) {
            newItem.next = head;
            head = newItem;
            return;
        }
        Item cur = head;
        for (int i = 1; i < position - 1 && cur != null; i++) {
            cur = cur.next;
        }
        if (cur != null) {
            newItem.next = cur.next;
            cur.next = newItem;
        }
    }

    // Remove Item from inventory
    public void removeItemByID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is Empty");
            return;
        }
        if (head.itemID == itemID) {
            head = head.next;
            return;
        }
        Item cur = head;
        while (cur.next != null && cur.next.itemID != itemID) {
            cur = cur.next;
        }
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    // Update item Quantity by item ID
    public void updateItemQuantity(int itemID, int newQuantity) {
        Item cur = head;
        while (cur != null && cur.itemID != itemID) {
            cur = cur.next;
        }
        if (cur != null) {
            cur.quantity = newQuantity;
        }
    }

    // Search an item by Item ID
    public Item searchItemByID(int itemID) {
        Item cur = head;
        while (cur != null && cur.itemID != itemID) {
            cur = cur.next;
        }
        return cur;
    }

    // Search an item by Item Name
    public Item searchItemByName(String itemName) {
        Item cur = head;
        while (cur != null && !cur.itemName.equals(itemName)) {
            cur = cur.next;
        }
        return cur;
    }

    // Method to calculate total value
    public void calculateTotalValue() {
        Item cur = head;
        double totalValue = 0;
        while (cur != null) {
            totalValue += cur.quantity * cur.price;
            cur = cur.next;
        }
        System.out.println("Total Value of Inventory: " + totalValue);
    }

    // Display all items
    public void displayAllItems() {
        Item temp = head;
        while (temp != null) {
            System.out.println("Item ID: " + temp.itemID + ", Item Name: " + temp.itemName + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    // Sort items based on Item Name
    public void sortByName() {
        if (head == null || head.next == null) {
            return;
        }
        head = mergeSortByName(head);
    }

    private Item mergeSortByName(Item head) {
        if (head == null || head.next == null) {
            return head;
        }
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSortByName(head);
        Item right = mergeSortByName(nextOfMiddle);
        return sortedMergeByName(left, right);
    }

    private Item sortedMergeByName(Item left, Item right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        Item result;
        if (left.itemName.compareTo(right.itemName) <= 0) {
            result = left;
            result.next = sortedMergeByName(left.next, right);
        } else {
            result = right;
            result.next = sortedMergeByName(left, right.next);
        }
        return result;
    }

    private Item getMiddle(Item head) {
        if (head == null) {
            return head;
        }
        Item slow = head;
        Item fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Sort items based on Price
    public void sortByPrice() {
        if (head == null || head.next == null) {
            return;
        }
        head = mergeSortByPrice(head);
    }

    private Item mergeSortByPrice(Item head) {
        if (head == null || head.next == null) {
            return head;
        }
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSortByPrice(head);
        Item right = mergeSortByPrice(nextOfMiddle);
        return sortedMergeByPrice(left, right);
    }

    private Item sortedMergeByPrice(Item left, Item right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        Item result;
        if (left.price <= right.price) {
            result = left;
            result.next = sortedMergeByPrice(left.next, right);
        } else {
            result = right;
            result.next = sortedMergeByPrice(left, right.next);
        }
        return result;
    }

    public static void main(String[] args) {
        InventoryManagement ob = new InventoryManagement();
        ob.addItemAtBeginning(1, "Item1", 10, 100.50);
        ob.addItemAtEnd(2, "Item2", 20, 200.75);
        ob.addItemAtPosition(3, "Item3", 15, 150.30, 2);
        ob.displayAllItems();
        ob.updateItemQuantity(2, 25);
        ob.displayAllItems();
        ob.removeItemByID(1);
        ob.displayAllItems();
        ob.calculateTotalValue();
        ob.sortByName();
        ob.displayAllItems();
        ob.sortByPrice();
        ob.displayAllItems();
    }
}
