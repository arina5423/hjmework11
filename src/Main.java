//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        checkLeapYear(2023);
        checkLeapYear(2024);
        suggestAppVersion(0, 2014);
        suggestAppVersion(1, 2015);
        System.out.println("Потребуется дней: " + calculateDeliveryDays(95));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(10));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(50));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(150));
    }
 // задача 1
    public static void checkLeapYear(int year) {
        boolean isLeap = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        if (isLeap) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    // задача 2
    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = osType == 0 ? "iOS" : "Android";
        String version = deviceYear < currentYear ? "облегченную" : "обычную";

        System.out.println("Установите " + version + " версию приложения для " + osName + " по ссылке");
    }
    // задача 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 100) {
            return -1;
        } else if (deliveryDistance >= 60) {
            return 3;
        } else if (deliveryDistance >= 20) {
            return 2;
        } else {
            return 1;
        }
    }
}