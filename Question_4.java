package Chapter_2_Practice_set_2.Chapter_2_Practice_set_2;
import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input values
        System.out.println("Enter value of v : ");
        int v = sc.nextInt();
        System.out.println("Enter value of u : ");
        int u = sc.nextInt();
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of s : ");
        int s = sc.nextInt();
        System.out.println("solution of expression");
        System.out.println("v^2 - u^2");
        System.out.println("---------");
        System.out.println("2as");

        //calculation
        float upStack = (v*v) - (u*u);
        float downStack = 2*a*s;
        float solution = upStack / downStack;
        System.out.println(solution);
    }
}
