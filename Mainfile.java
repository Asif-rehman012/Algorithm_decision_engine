import java.util.Scanner;

public class Mainfile {

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Advanced Algorithm Decision Engine\n");

        System.out.print("Describe your problem: ");
        String desc = sc.nextLine();

        System.out.print("Enter input size (n): ");
        int n = sc.nextInt();

        System.out.print("Is graph weighted? (true/false): ");
        boolean weighted = sc.nextBoolean();

        System.out.print("Has negative weight? (true/false): ");
        boolean negative = sc.nextBoolean();

        Problem problem = new Problem(desc, n, weighted, negative);
        DecisionEngine.decide(problem);

        sc.close();
    }
}
