import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        checkYear(2024);

        System.out.println("\nЗадача 2");
        printDeviceVersion(1, 2026);

        System.out.println("\nЗадача 3");
        int days = calculateDistance(67);
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println( "Количество дней = " + days);
        }
    }

    public static  void checkYear (int year) {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + " год является високосным.");
    } else {
        System.out.println(year + " год является не високосным.");
    }
}
    public static void printDeviceVersion (int osType, int year) {
        int currentYear = LocalDate.now().getYear();
        var type = osType == 1 ? "Android" : "iOS";
        var appType = year != currentYear  ? "облегченную " : "";
        System.out.println("Установите " + appType + "версию для системы " + type);
    }

        public static int calculateDistance (int distance) {
            if (distance > 100) {
                return -1;
            }
            int days = 1;
            if (distance <= 20) {
                days++;
            }
            if (distance > 20 && distance < 60) {
                days++;
            }
            if (distance >= 60 && distance < 100) {
                days ++;
            }
            return days;
        }
    }
