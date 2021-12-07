import java.util.Scanner;

public class ProblemNo1 {
    public static void main(String[] args) {
        int f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Prime Numbers are: ");
        for (int i = 2; i <= num; i++) {
            f = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    f = 1;
                    break;
                }
            }

            if (f == 0) {
                System.out.println(i + "");
            }
        }

    }
}






