import java.util.Scanner;

public class Task4 {

    //Составить программу, которая в зависимости от порядкового номера дня недели (1, 2, ..., 7)
    // выводит на экран его название (понедельник, вторник, ..., воскресенье).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();

        switch(day) {
            case 1: //day == 1
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Введен несуществующий порядковый номер дня недели");
                break;
        }
    }
}
