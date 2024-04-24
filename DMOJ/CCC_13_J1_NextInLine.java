import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_13_J1_NextInLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int youngestAge = Integer.parseInt(br.readLine());
        int middleAge = Integer.parseInt(br.readLine());

        System.out.println(middleAge + (middleAge - youngestAge));
    }
}