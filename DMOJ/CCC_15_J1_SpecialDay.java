import java.io.*;

public class CCC_15_J1_SpecialDay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        int date = (month * 100) + day;

        if (date == 218) {
            System.out.println("Special");
        } else {
            if (date < 218) {
                System.out.println("Before");
            } else {
                System.out.println("After");
            }
        }
    }
}