import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 2
        System.out.println("Task 2");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 3
        System.out.println("Task 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 4
        System.out.println("Task 4");

        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 5
        System.out.println("Task 5");

        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

        //Task 6
        System.out.println("Task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 7
        System.out.println("Task 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Task 8
        System.out.println("Task 8");

        double salary = 29_000;
        double total = 0;

        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        //Task 9
        System.out.println("Task 9");

        salary = 29_000;
        total = 0;
        double percent = (double) 12 / 12 / 100;

        for (int i = 1; i <= 12; i++) {
            total += salary;
            total += total * percent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) total + " рублей");
        }

        //Task 10
        System.out.println("Task 10");

        for (int multiplayer = 1; multiplayer <= 10; multiplayer++) {
            System.out.printf("%d * %d = %d%n", 2, multiplayer, 2 * multiplayer);
        }
    }
}