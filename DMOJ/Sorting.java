import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        // Scanner
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Sorter
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();

            // Empty
            if (sorted.isEmpty()) {
                sorted.add(x);
            }
            // Sort
            else {
                int j = 0;
                while (true) {
                    // Less than
                    if (x < sorted.get(j)) {
                        sorted.add(j, x);
                        break;
                    }
                    // Greatest
                    else if (j == sorted.size() - 1) {
                        sorted.add(x);
                        break;
                    }

                    j++;
                }
            }
        }

        // Result Printer
        for (int x: sorted) {
            System.out.println(x);
        }

        in.close();
    }
}
