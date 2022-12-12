import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aman2 {
    public static void main(String[] args) throws IOException {
        int num1 = 0;
        int num2 = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string");
        int z = Integer.parseInt(br.readLine());
        int sum = 0;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i <= z; i++) {
            sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
