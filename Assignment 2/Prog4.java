public class Prog4 {
    public static void main(String[] args) {
        float number1 = 1.27f;
        float number2 = 3.881f;
        float number3 = 9.6f;

        // Calculate the sum of the floats as an integer using casting
        int sumCasting = (int) (number1 + number2 + number3);

        // Calculate the sum of the floats as an integer using Math.round
        int sumRounded = Math.round(number1 + number2 + number3);

        // Output the results
        System.out.println("Sum (casting): " + sumCasting);
        System.out.println("Sum (rounded): " + sumRounded);
    }
}
