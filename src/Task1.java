import java.util.Scanner;

public class Task1 {

    //1. Дано натуральное число. Определить:
    //    1. является ли оно четным;
    //    2. оканчивается ли оно цифрой 7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        if (number % 10 == 7) {
            System.out.println("Число оканчивается на 7");
        }

    }
}
