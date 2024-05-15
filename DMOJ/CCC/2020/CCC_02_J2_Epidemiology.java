import java.util.*;

public class CCC_02_J2_Epidemiology {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int p = in.nextInt();
        int newlyInfected = in.nextInt();
        int r = in.nextInt();
        int days = 0;

        int totalInfected = newlyInfected;
        while (totalInfected <= p) {
            newlyInfected *= r;
            totalInfected += newlyInfected;
            days++;
        }

        System.out.println(days);
        in.close();
    }
}
