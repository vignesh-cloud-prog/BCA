import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        System.out.println("Enter the number n to print the fibonacci series");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        System.out.println("First " + n + " Fibonacci number using non-recursive function");
        getFib(n);

        System.out.println("\nFirst " + n + " Fibonacci number using recursive function");
        for (int i = 0; i < n; i++) {
            System.out.print(getFibSeq(i)+ "\t");
        }
    }

    public static void getFib(int n) {
        int n1 = 0, n2 = 1, n3, i;
        for (i = 1; i <= n; i++) {
            System.out.print(n1 + "\t");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    public static int getFibSeq(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return getFibSeq(n - 1) + getFibSeq(n - 2);
    }
}
