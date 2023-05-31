public class Prog2 {
    public static void main(String[] args) {
        String records = "231A,Light Bulb,123,Wilco,1.75:" +
                "113D,Hairbrush,19,Aamco,3.75:" +
                "521W,Shampoo,24,Acme,6.95:" +
                "440Q,Dishwashing Detergent,20,Wilco,1.75:" +
                "009G,Toothbrush,77,Wilco,0.85:" +
                "336C,Comb,34,Wilco,0.99:" +
                "523E,Paper Pad Set,109,Congdon and Chrome,2.45:" +
                "888A,Fake Diamond Ring,111,AmericusDiamond,3.95:" +
                "176A,Romance Nove1 1,20,Barnes and Noble,3.50:" +
                "176B,Romance Nove1 2,20,Barnes and Noble,3.50:";

        // Split records into individual rows using ":"
        String[] rows = records.split(":");

        // Iterate through each row and extract the product ID from the first column
        for (String row : rows) {
            String[] columns = row.split(","); // Split columns using ","
            String productId = columns[0]; // First column is always productId
            System.out.println(productId);
        }
    }
}
