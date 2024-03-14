import java.util.ArrayList;
import java.util.List;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }
    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        String[] data = grades.split(";");

        for (String item : data) {
            String[] info = item.split(",");
            String name = capitalize(info[0]);
            String surname = capitalize(info[1]);
            String subject = info[2].toLowerCase();
            String grade = gradeToString(info[3]);
            System.out.println(String.join(" ", name, surname, subject, "-", grade));

        }


    }
    public String serializeGrades(String[] grades) {
        List<String> data = new ArrayList<>();
        for (String grade: grades) {
            String[] items = grade.toLowerCase().split(" ");
            data.add(String.join(",", items[0],items[1],items[2],gradeStringToInt(items[4])));

        }
        return String.join(";", data);

    }


}
