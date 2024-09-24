public class Main {
    public static void main(String[] args) {
        DoubleDimensionArray dda = new DoubleDimensionArray(3, 3);

        // Insert elements
        dda.insert(0, 0, 1);
        dda.insert(0, 1, 2);
        dda.insert(0, 2, 3);
        dda.insert(1, 0, 4);
        dda.insert(1, 1, 5);
        dda.insert(1, 2, 6);
        dda.insert(2, 0, 7);
        dda.insert(2, 1, 8);
        dda.insert(2, 2, 9);

        // Traverse array
        System.out.println("Array elements:");
        dda.traverse();

        // Search for an element
        int searchValue = 5;
        boolean found = dda.search(searchValue);
        System.out.println("Element " + searchValue + " found: " + found);

        // Delete an element
        dda.delete(1, 1);
        System.out.println("Array after deleting element at index (1, 1):");
        dda.traverse();
    }
}