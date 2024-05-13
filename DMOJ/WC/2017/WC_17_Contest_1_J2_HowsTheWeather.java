import java.util.*;

public class WC_17_Contest_1_J2_HowsTheWeather {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(CtoF(in.nextInt()));

        in.close();
    }

    static int CtoF(double celsius) {
        return (int) (celsius * (9.0/5.0)) + 32;
    }
}
