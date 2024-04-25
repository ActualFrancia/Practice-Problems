import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_07_J1_WhoIsInTheMiddle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());


        // check if n2 is in between n1 and n3
        if ((n1 < n2 && n2 < n3) || (n3 < n2 && n2 < n1)) {
            System.out.println(n2);
        }
        // check if n1 is in between n2 and n3
        else if ((n2 < n1 && n1 < n3) || (n3 < n1 && n1 < n2)) {
            System.out.println(n1);
        }
        // n3
        else {
            System.out.println(n3);
        }
    }
}