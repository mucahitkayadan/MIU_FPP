public class Prog1 {
    public static void main(String[] args) {
        // 1. Compute π^x
        int x = RandomNumbers.getRandomInt(1, 9);
        double piPowerX = Math.pow(Math.PI, x);
        System.out.println("π^" + x + " = " + piPowerX);

        // 2. Compute y^π
        int y = RandomNumbers.getRandomInt(3, 14);
        double yPowerPi = Math.pow(y, Math.PI);
        System.out.println(y + "^π = " + yPowerPi);
    }
}
