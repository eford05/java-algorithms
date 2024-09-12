import Arrays.ArrayInsertion;

public class Main {
    public static void main(String[] args) {
        //Run array insertion test
        ArrayInsertion arr = new ArrayInsertion(10);

        //At cell index 0, insert value 0
        arr.insert(0, 0);
        //At cell index 1, insert value 10
        arr.insert(1, 10);
        //At cell index 2, insert 20
        arr.insert(2, 20);
        //At cell index 1, insert value 30 --> cell occupied
        arr.insert(1, 30);
        //At cell index 12, value 120 --> out of bounds
        arr.insert(12, 120);

    }
}
