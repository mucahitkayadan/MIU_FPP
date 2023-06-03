public class ReverseDigits {
    public static void displayDigitsInReverse(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n % 10 + " ");
        displayDigitsInReverse(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        displayDigitsInReverse(number);
    }
}

/*
********** Runtime Stack Representation ***********
displayDigitsInReverse(12345)
displayDigitsInReverse(1234)
displayDigitsInReverse(123)
displayDigitsInReverse(12)
displayDigitsInReverse(1)
displayDigitsInReverse(0)
Print: 1
Print: 2
Print: 3
Print: 4
Print: 5
*/
