import java.util.*;

public class CCC_14_J1_TriangleTimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int angle1 = in.nextInt();
        int angle2 = in.nextInt();
        int angle3 = in.nextInt();
        in.close();

        // check if triangle
        if (angle1 + angle2 + angle3 != 180) {
            // not triangle
            System.out.println("Error");
        }
        else {
            // Equilateral
            if ((angle1 == angle2) && (angle2 == angle3)) {
                System.out.println("Equilateral");
            }
            // Isosceles
            else if ((angle1 == angle2) || (angle1 == angle3) || (angle2 == angle3)) {
                System.out.println("Isosceles");
            }
            // Scalene
            else {
                System.out.println("Scalene");
            }
        }
    }
}