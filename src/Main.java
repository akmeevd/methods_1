import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int year = 400;
        checkYearAndPrint(year);
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2022;
        printVersionForOS(clientOS, clientDeviceYear);
    }

    public static void task3() {
        int distance = 19;
        printDaysForDelivery(distance);
    }


    public static void checkYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            ;
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    public static void printVersionForOS(int a, int b) {
        int currentYear = LocalDate.now().getYear();
        if (a == 0) {
            if (b == currentYear) {
                System.out.println("Установите обычную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        } else if (a == 1) {
            if (b == currentYear) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void printDaysForDelivery(int distance) {
        int start = 20;
        int interval = 40;
        int days = 1;
        if (distance > start) {
            days++;
        }
        for (int i = 0; ; i++) {
            if (distance > (start + interval - 1)) {
                start = start + interval;
                days++;
            } else {
                break;
            }
        }
        System.out.println(days);

    }
}