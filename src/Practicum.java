import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {

       System.out.println(numberOfRepeats("раз два три, раз два три", "раз")); // вернёт 2
        System.out.println(numberOfRepeats("Hello, world!", "goodbye")); // вернёт 0);

    }

    public static boolean startsWith(String initial, String other) {
        return other.indexOf(initial) == 0;
    }
    public static boolean endsWith(String initial, String other) {
        return initial.lastIndexOf(other) + other.length() == initial.length();
    }
    // консольный интерфейс для управления программой
    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - ввести количество шагов за определённый день");
        System.out.println("2 - изменить цель по количеству шагов в день");
        System.out.println("3 - напечатать статистику за определённый месяц");
        System.out.println("0 - Выход");
    }

    public String fixString(String str) {
        if (str.isBlank() || str.isEmpty())
            return "Вы ничего не ввели!";
        return str.trim();
    }
    private boolean isCapsLock = false;

    public void capsLock() {
        // Здесь нужно изменить значение флага isCapsLock на противоположное
        isCapsLock = !isCapsLock;
    }

    public void print(String str) {
        // а здесь нужно распечатать строку или в верхнем регистре, или без изменений, учитывая флаг
        if (isCapsLock)
            System.out.print(str.toUpperCase());
        else
            System.out.print(str.toLowerCase());
    }

    public static int numberOfRepeats(String text, String substring)
    {
        int count = 0;
        while (text.contains(substring))
        {
            int start = text.indexOf(substring) + substring.length();
            text = text.substring(start);
            count++;
        }
        return count;
    }

    public static String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

}
