package Arrays;

public class ArrayInsertion {
    int arr[] = null;

    //Set array cells with integer min value to keep track of cells
    public ArrayInsertion(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Insertion Method
    public void insert(int cellIndex, int valueToInsert) {
        try {
            // If the cell index is occupied by integer min value -> success
            if (arr[cellIndex] == Integer.MIN_VALUE) {
                arr[cellIndex] = valueToInsert;
                System.out.printf("Value %d successfully inserted at cell %d%n", valueToInsert, cellIndex);
            }
            // Otherwise the cell is occupied
            else {
                System.out.printf("The cell %d is already occupied with a value of %d%n", cellIndex, arr[cellIndex]);
            }

        }
        // Catch out of bounds exception
        catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("Out of bounds for index at cell %d!", cellIndex);
        }

    }
}
