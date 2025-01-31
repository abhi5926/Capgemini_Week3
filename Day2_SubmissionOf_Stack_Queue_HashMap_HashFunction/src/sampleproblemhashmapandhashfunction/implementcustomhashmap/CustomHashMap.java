package sampleproblemhashmapandhashfunction.implementcustomhashmap;

// HashMap class implementing a basic hash map with collision handling
class CustomHashMap {
    private Node[] table;
    private int capacity;

    // Constructor to initialize the hash map with a given capacity
    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        table = new Node[capacity];
    }

    // Hash function to get the index for a key
    private int getHash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Insert key-value pair into the hash map
    public void put(String key, String value) {
        int index = getHash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;  // Update the value if key is already present
                    return;
                }
                current = current.next;
            }
            newNode.next = table[index];
            table[index] = newNode;
        }
    }

    // Retrieve the value for a given key
    public String get(String key) {
        int index = getHash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;  // Key not found
    }

    // Remove the key-value pair from the hash map
    public void remove(String key) {
        int index = getHash(key);
        Node current = table[index];
        Node previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;  // Remove the first node
                } else {
                    previous.next = current.next;  // Remove the node from the middle or end
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    // Print the entire hash map for debugging purposes
    public void printHashMap() {
        for (int i = 0; i < capacity; i++) {
            Node current = table[i];
            if (current != null) {
                System.out.print("Index " + i + ": ");
                while (current != null) {
                    System.out.print("[" + current.key + "=" + current.value + "] ");
                    current = current.next;
                }
                System.out.println();
            }
        }
    }
}



