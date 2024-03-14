import java.util.Scanner;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        String[] names = new String[items.length];
        String[] counts = new String[items.length];
        String[] prices = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            String[] data = items[i].split(", ");
            names[i] = data[0];
            counts[i] = data[1];
            prices[i] = data[2];
        }

        int maxNameLength = findMaxLength(names);
        int maxCountLength = findMaxLength(counts);
        int maxPriceLength = findMaxLength(prices);

        String format = "%-" + (maxNameLength + 2) + "s%-" + (maxCountLength + 2) + "s%-" + (maxPriceLength + 2) + "s\n";
        for (int i = 0; i < items.length; i++) {
            System.out.printf(format, names[i], counts[i], prices[i]);
           // "%-10s%-7s%-8s\n"
        }


    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество записей:");
//        int n = Integer.parseInt(scanner.nextLine());
        String[] values = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
//        for (int i = 0; i < n; ++i)
//            values[i] = scanner.nextLine();
        printCheck(values);
    }
}