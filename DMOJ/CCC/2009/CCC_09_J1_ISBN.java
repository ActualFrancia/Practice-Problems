import java.util.Scanner;

public class CCC_09_J1_ISBN {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

         String isbnString = "9780921418" + in.next() + in.next() + in.next();

         int sum = 0;
         for (int i = 0; i < isbnString.length(); i++) {
             // Even
             if (i % 2 == 0) {
                sum += Character.getNumericValue(isbnString.charAt(i));
             }
             // Odd
             else {
                 sum += Character.getNumericValue(isbnString.charAt(i)) * 3;
             }
         }

         System.out.println("The 1-3-sum is " + sum);
         in.close();
    }
}
