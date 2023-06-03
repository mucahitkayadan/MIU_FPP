public class CountDigits {
    public static int countNumberOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + countNumberOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        int digitCount = countNumberOfDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
}
/*
*********** Runtime Stack Representation **********
countNumberOfDigits(12345)
countNumberOfDigits(1234)
countNumberOfDigits(123)
countNumberOfDigits(12)
countNumberOfDigits(1)
countNumberOfDigits(0)
Return: 1
Return: 2
Return: 3
Return: 4
Return: 5
*/
