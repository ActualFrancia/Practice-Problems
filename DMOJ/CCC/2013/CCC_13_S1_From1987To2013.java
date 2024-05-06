import java.util.*;

public class CCC_13_S1_From1987To2013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        boolean repeated = true;

        while (repeated) {
            year += 1;
            String yearString = Integer.toString(year);
            repeated = false;

            for (int i = 0; i < yearString.length(); i++) {
                char c = yearString.charAt(i);

                for (int j = i + 1; j < yearString.length(); j++) {
                    if (c == yearString.charAt(j)) {
                        repeated = true;
                        break;
                    }
                }
            }
        }

        System.out.println(year);
        in.close();
    }
}