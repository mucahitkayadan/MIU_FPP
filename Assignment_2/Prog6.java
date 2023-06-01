public class Prog6 {
    public static void main(String[] args) {
        int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

        int minimum = min(arrayOfInts);

        System.out.println("Minimum: " + minimum);
    }

    public static int min(int[] arrayOfInts) {
        if (arrayOfInts == null || arrayOfInts.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int minimum = arrayOfInts[0];

        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < minimum) {
                minimum = arrayOfInts[i];
            }
        }

        return minimum;
    }
}
