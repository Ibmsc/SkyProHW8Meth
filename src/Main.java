public class Main {
    public static void leapYear(int year) {
        // Здесь пишем код первого задания
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным!");
        }else {
            System.out.println(year + " год не является високосным!");
        }
    }
    public static void checkingOS(int clientOS, int clientDeviceYear){
        if (clientOS == 0 ){
            if(clientDeviceYear < 2022){
                System.out.println("Установите Lite версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите обычную версию приложения да iOS по ссылке");
            }
        } else if (clientOS == 1 && clientDeviceYear < 2022) {

            System.out.println("Установите Lite версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }
    public static void deliveryDistance (int distance) {
        int deliveryDay = 1;

        if (distance > 20){
            deliveryDay++;
        }
        if ( distance > 60 ) {
            deliveryDay++;
        }
        if ( distance > 100) {
            System.out.println("Нет доставки");
            return ;
        }
        System.out.println("Потребуется дней : " + deliveryDay);
    }
        public static void main (String[]args){
                System.out.println("Задача №1!");
                leapYear(2020);

                System.out.println("Задача №2!");

                checkingOS(0,2022);

                System.out.println("Задача №3!");
                deliveryDistance(100);
        }
}