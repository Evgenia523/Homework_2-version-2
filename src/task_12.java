import java.util.Scanner;

public class task_12 {
    public static void main(String[] args) {
        System.out.println("Задание № 12");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число:");
        int n = scanner.nextInt();

        int left = (n / 100_000)% 10 + (n / 10_000) % 10 + (n / 1_000) % 10;
        int right = (n / 100) % 10 + (n / 10) % 10 + n % 10;
        if (left == right) {
            System.out.println("Счастливое");
        } else {
            System.out.println("Не счастливое");
        }
    }
}
