public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    //ios = 0
    //android = 1
    public static void exercise1() {

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void exercise2() {

        int clientOS = 1;
        int clientDeviceYear = 2014;


        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void exercise3() {

        int year = 400;

        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год НЕ является високосным");
        }
    }

    public static void exercise4() {

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            deliveryDays++;
        }
        System.out.println(deliveryDays);
    }

    public static void exercise5() {

        int monthNumber = 8;

        switch (monthNumber) {

            case 1: case 2: case 12:
                System.out.println("Сейчас зима");
                break;
            case 3: case 4: case 5:
                System.out.println("Сейчас весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Сейчас лето");
                break;
            case 9: case 10: case 11:
                System.out.println("Сейчас осень");
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}