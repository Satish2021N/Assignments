import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Data Representation
        int n;
        int sum = 0;

        //Input
        System.out.println("Enter the integers with one gap: ");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("Sum of integers is: " + sum);
        sc.close();

    }

}
