import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        System.out.println("Задание № 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите животное");
        System.out.println("1. Кошка");
        System.out.println("2. Собака");
        System.out.println("3. Корова");
        System.out.println("4. Коза");
        System.out.println("5. Мышь");
        System.out.println("6. Гусь");
        System.out.println("7. Свинья");
        System.out.println("8. Петух");
        System.out.println("9. Лев");
        System.out.println("10. Сова");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("мяу-мяу");
                break;
            case 2:
                System.out.println("гав-гав");
                break;
            case 3:
                System.out.println("мууу");
                break;
            case 4:
                System.out.println("беее");
                break;
            case 5:
                System.out.println("пи-пи-пи");
                break;
            case 6:
                System.out.println("га-га-га");
                break;
            case 7:
                System.out.println("хрю-хрю");
                break;
            case 8:
                System.out.println("ку-ка-ре-ку");
                break;
            case 9:
                System.out.println("рыыыы");
                break;
            case 10:
                System.out.println("уху - уху");
                break;
            default:
                System.out.println("Выберите животное из списка");
                break;
        }
    }
}
