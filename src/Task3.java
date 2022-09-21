import java.util.Scanner;

public class Task3 {

    //3. Известен вес боксера-любителя. Известно, что вес таков, что боксер может быть отнесен к одной из трех весовых категорий:
    //    1. легкий вес — до 60 кг;
    //    2. средний вес — до 75 кг;
    //    3. тяжелый вес — до 91 кг;
    //    4. супертяжелый вес – с 91 кг.
    //	Определить, в какой категории будет выступать данный боксер.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вес");
        int weight = sc.nextInt();
        sc.close();

        if (weight >= 91) {
            System.out.println("супертяжелый вес");
        } else if (weight >= 75) {
            System.out.println("тяжелый вес");
        } else if (weight >= 60) {
            System.out.println("средний вес");
        } else {
            System.out.println("легкий вес");
        }
    }
}
