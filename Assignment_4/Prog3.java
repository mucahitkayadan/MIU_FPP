public class ArraySum {
    public static int computeArraySum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }

        return arr[n - 1] + computeArraySum(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = computeArraySum(array, array.length);
        System.out.println("Sum: " + sum);
    }
}

/*
*************Runtime Stack Representation**************
computeArraySum([1, 2, 3, 4, 5], 5)
computeArraySum([1, 2, 3, 4, 5], 4)
computeArraySum([1, 2, 3, 4, 5], 3)
computeArraySum([1, 2, 3, 4, 5], 2)
computeArraySum([1, 2, 3, 4, 5], 1)
computeArraySum([1, 2, 3, 4, 5], 0)
Return: 1
Return: 3
Return: 6
Return: 10
Return: 15
*/
