public class Main {
    public static void main(String[] args) {
        System.out.println("Hello SkyPro!");
        // Задание номер 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача номер 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Для пользователей телефонов 2015 года выпуска установите обычное приложение.");
        }
        // Задание номер 3
        int year = 1789;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " Год является высокостным!");
        } else {
            System.out.println(year + " Год не является высокостным!");
        }
        // Задание номер 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println(deliveryDays + " день потребуется на доставку карты");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 1;
            System.out.println(deliveryDays + " дня потребуется на доставку карты");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            deliveryDays += 2;
            System.out.println(deliveryDays + " дня потребуется на доставку карты");
        } else {
            System.out.println("Доставка не возможна");
            // Задание номер 5
            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь принадлежит к сезону зима.");
                    break;
                case 2:
                    System.out.println("Февраль принадлежит к сезону зима.");
                    break;
                case 3:
                    System.out.println("Март принадлежит к сезону весна");
                    break;
                case 4:
                    System.out.println("Апрель принадлежит к сезону весна");
                    break;
                case 5:
                    System.out.println("Май принадлежит к сезону весна");
                    break;
                case 6:
                    System.out.println("Июнь принадлежит к сезону Лето");
                    break;
                case 7:
                    System.out.println("Июль принадлежит к сезону Лето");
                    break;
                case 8:
                    System.out.println("Август принадлежит к сезону Лето");
                    break;
                case 9:
                    System.out.println("Сентябрь принадлежит к сезону Осень");
                    break;
                case 10:
                    System.out.println("Октябрь принадлежит к сезону Осень");
                    break;
                case 11:
                    System.out.println("Ноябрь принадлежит к сезону Осень");
                    break;
                case 12:
                    System.out.println("Декабрь принадлежит к сезону Зима");
                    break;
                default:
                    System.out.println("Такого месяца и сезона не существует");
            }


        }


    }


}

