public class Main {
    public static void main(String[] args) {
//Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOs.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android.");
        }
        //Задача 2
        int clientDeviceYear = 2015;
        int clientsOS = 1;
        if (clientsOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOs.");
        } else if (clientsOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для IOs.");
        }
        if (clientsOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android.");
        } else if (clientsOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android.");
        }
        //Задача 3
        int year = 1111;
        int leapYear = year % 4;
        int notLeapYear = year % 100;
        int leapYearNew = year % 400;
        if (leapYear == 0 && notLeapYear != 0 || leapYearNew == 0) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный.");
        }
        //Задача 4
        int deliveryDistance = 30;
        boolean oneZone = deliveryDistance <= 20;
        boolean twoZone = deliveryDistance >= 20 && deliveryDistance < 60;
        boolean threeZone = deliveryDistance>= 60&& deliveryDistance <100;
        int day =1;
        if (oneZone) {
            System.out.println("доставка " + day + " день");
        }else if (twoZone) {
            System.out.println("доставка " + (day +1)+ " дня");
        } else if (threeZone){
            System.out.println("доставка " + (day +2) + " дня");
        }
        //Задача 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:

        }
        //как то так
    }
}
