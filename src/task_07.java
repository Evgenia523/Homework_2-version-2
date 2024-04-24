import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_07 {
    public static void main(String[] args) {
        System.out.println("Задание № 7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String simbol = scanner.nextLine();

        Pattern patKirLetter = Pattern.compile("[а-яА-Я]");
        Matcher matKirLetter = patKirLetter.matcher(simbol);

        Pattern patLatLetter = Pattern.compile("[a-zA-Z]");
        Matcher matLatLetter = patLatLetter.matcher(simbol);

        Pattern patnumber = Pattern.compile("[0-9]");
        Matcher matNumber = patnumber.matcher(simbol);

        if (matLatLetter.matches()) {
            System.out.println("Латиница");
        } else if (matKirLetter.matches()) {
            System.out.println("Кирилица");
        } else if (matNumber.matches()) {
            System.out.println("Цифра");
        } else {
            System.out.println("Невозможно определить");
        }
    }
}
