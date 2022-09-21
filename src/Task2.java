import java.util.Scanner;

public class Task2 {

    //Составить программу, которая уменьшает первое введенное число в два раза, если оно больше второго введенного числа по абсолютной величине.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a > Math.abs(b)) {
            a /= 2; // a = a /2
        }

        System.out.println("a = " + a);
    }
}
