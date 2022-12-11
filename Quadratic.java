import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aman {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of A:");
        double a = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of B:");
        double b = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of C:");
        double c = Integer.parseInt(br.readLine());
        double dis = b * b - 4 * a * c;
        if (dis == 0) {
            double x = (-b + Math.sqrt(dis)) / 2 * a;
            System.out.println("The roots are real and same:" + x);
        } else if (dis > 0) {
            double y = (-b + Math.sqrt(dis)) / 2 * a;
            double z = (-b - Math.sqrt(dis)) / 2 * a;
            System.out.println("The roots are real and different:" + y + "and" + z);
        } else {
            System.out.println("There is no real root.");
        }
    }
}
