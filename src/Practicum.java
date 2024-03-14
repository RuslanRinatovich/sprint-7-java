import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

public class Practicum {


    public static void main(String[] args) {

        System.out.println(numberOfRepeats2("раз два раз два три раз", "раз"));
        System.out.println(numberOfRepeats2("рeаз два рeаз два три раeз", "раз"));
    }

    public String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public String fixText(String text) {
        // Реализуйте этот метод

        text = text.replace("„", "«").replace("“", "»").replace("цевилизаций", "цивилизаций");
        text = text.trim();
        return capitalize(text);
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

    public static int numberOfRepeats(String text, String substring) {
        int count = 0;
        while (text.contains(substring)) {
            int start = text.indexOf(substring) + substring.length();
            text = text.substring(start);
            count++;
        }
        return count;
    }
    public static int numberOfRepeats2(String text, String substring) {
        int count = 0;
        StringBuilder str = new StringBuilder(text);
        while (str.indexOf(substring) != -1) {
            int start = str.indexOf(substring);
            str.delete(0, start + substring.length());
            count++;
        }
        return count;
    }

    public boolean isPalindromeWord(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase());
        while (stringBuilder.indexOf(" ") != -1)
        {
            stringBuilder.deleteCharAt(stringBuilder.indexOf(" "));
        }
        str = stringBuilder.toString();
        return str.contentEquals(stringBuilder.reverse());
    }

}
