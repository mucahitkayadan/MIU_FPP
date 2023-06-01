public class RemoveDups {
    public static void main(String[] args) {
        String[] inputArray = {"horse", "dog", "cat", "horse", "dog"};

        String[] uniqueArray = removeDuplicates(inputArray);

        // Print the unique array
        for (String str : uniqueArray) {
            System.out.println(str);
        }
    }

    public static String[] removeDuplicates(String[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new String[0]; // Return an empty array if input is null or empty
        }

        int n = inputArray.length;
        int uniqueCount = 0;

        // Create a temporary array to store unique strings
        String[] tempArray = new String[n];

        // Traverse the input array
        for (int i = 0; i < n; i++) {
            String currentString = inputArray[i];

            // Check if the current string is not null and does not already exist in the temporary array
            if (currentString != null && !isStringExists(tempArray, uniqueCount, currentString)) {
                tempArray[uniqueCount] = currentString;
                uniqueCount++;
            }
        }

        // Create a new array with the exact size required
        String[] uniqueArray = new String[uniqueCount];
        System.arraycopy(tempArray, 0, uniqueArray, 0, uniqueCount);

        return uniqueArray;
    }

    public static boolean isStringExists(String[] array, int length, String str) {
        for (int i = 0; i < length; i++) {
            if (str.equals(array[i])) {
                return true;
            }
        }
        return false;
    }
}
