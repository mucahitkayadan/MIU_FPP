public class Prog5 {
    public static void main(String[] args) {
        int[] arrayA = {5, 6, -4, 3, 1};
        int[] arrayB = {3, 8, 9, 11};

        int[] combinedArray = combine(arrayA, arrayB);

        // Output the combined array
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] combine(int[] a, int[] b) {
        int lengthA = a.length;
        int lengthB = b.length;

        int[] combinedArray = new int[lengthA + lengthB];

        // Copy elements from array A to the combined array
        System.arraycopy(a, 0, combinedArray, 0, lengthA);

        // Copy elements from array B to the combined array
        System.arraycopy(b, 0, combinedArray, lengthA, lengthB);

        return combinedArray;
    }
}
