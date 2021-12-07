
public class ProblemNo5a {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4)
                    System.out.println("");
                else if (j == 0 || j == 4)
                    System.out.println("*");
                else
                    System.out.println("");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

}

