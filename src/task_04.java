import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {
        System.out.println("Задание № 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату х:  ");
        double x = scanner.nextDouble();
        System.out.print("Введите координату y:  ");
        double y = scanner.nextDouble();
        if (x >0 && y > 0) {
            System.out.println("Точка находиться в первой четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находиться во второй  четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находиться в третьей четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находиться в четвертой четверти");
        } else  {
            System.out.println("Точка находиться на окружности");
        }
    }
}
