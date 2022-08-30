public class Main {
    public static void leapYearCheck (int Year) {
        if (Year % 4 == 0) {
            System.out.println(Year + " - високосный год");
        } else {
            System.out.println(Year + " - невисокосный год");
        }
    }
    public static void checkVersion (int os, int year) {
        int currentYear = 2022;
        String s = "";
        if (year >= currentYear) {
            s = s + "Установите полную версию";
        } else {
            s = s + "Установите lite версию";
        }
        if (os == 0) {
            s = s + " для IOS";
        } else {
            s = s + " для Android";
        }
        System.out.println(s);
    }
    public static int calculateDeliveryTime (int distance) {
        int a =1;
        if (distance <= 20) {
            return (a);
        } else {
            for (int i = 21; i < distance; i= i+40) {
                a = a +1;
            }
            return a;
        }
    }
    //task1
    public static void main(String[] args) {
        int a = 2022;
        leapYearCheck(a);

        //task2
        int year = 2021;
        int os = 1;
        checkVersion(os, year);

        //task3
        int deliveryDistance = 95;
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
        System.out.println("Время доставки составит " + deliveryTime + " сут.");
    }
}