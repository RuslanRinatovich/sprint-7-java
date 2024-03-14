import java.util.Scanner;

public class CheckPrinter {
    public static void printCheck(String[] items) {
        for (String item: items) {
            String[] data = item.split(", ");
            System.out.printf("%-10s%-7s%-8s\n", data[0], data[1], data[2]);
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество записей:");
//        int n = Integer.parseInt(scanner.nextLine());
        String[] values = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
//        for (int i=0; i<n; ++i)
//            values[i] = scanner.nextLine();
        printCheck(values);
    }
}