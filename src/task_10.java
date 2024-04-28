import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        System.out.println("Задание № 10");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        int nomer = scanner.nextInt();
        var podezd = (nomer + 35)/36;
        nomer -=(podezd - 1)*36;
        var etag = (nomer + 3)/4;
        System.out.println("подъезд = " + podezd);
        System.out.println("этаж = " + etag);
    }
}
