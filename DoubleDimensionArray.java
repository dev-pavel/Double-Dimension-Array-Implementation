public class DoubleDimensionArray {
    private final int[][] array;
    private final int rows;
    private final int cols;

    public DoubleDimensionArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        array = new int[rows][cols];
    }

    public void insert(int row, int col, int value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            array[row][col] = value;
        } else {
            System.out.println("Invalid index");
        }
    }

    public void traverse() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean search(int value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public void delete(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            array[row][col] = 0; // Assuming 0 is the default value
        } else {
            System.out.println("Invalid index");
        }
    }
}