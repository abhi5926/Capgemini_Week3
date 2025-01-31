package sampleproblemhashmapandhashfunction.implementcustomhashmap;


    // Main class to test the hash map
    public class Main {
        public static void main(String[] args) {
            CustomHashMap hashMap = new CustomHashMap(10);

            hashMap.put("apple", "fruit");
            hashMap.put("carrot", "vegetable");
            hashMap.put("banana", "fruit");
            hashMap.put("tomato", "vegetable");

            System.out.println("Value for 'apple': " + hashMap.get("apple"));
            System.out.println("Value for 'banana': " + hashMap.get("banana"));

            hashMap.remove("apple");
            System.out.println("Value for 'apple' after removal: ");
            hashMap.printHashMap();


        }
    }
