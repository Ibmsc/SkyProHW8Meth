public class Main {
    public static void task1(int year) {
        // Здесь пишем код первого задания
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным!");
            return;
        }else {  System.out.println(year + " год не является високосным!");
        return;
        }
    }

    public static void task2СheckingOS(int clientOS){

       if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        return;}

    public static void task2YearOfRelease(int yearOS) {

        if (yearOS < 2022){
            System.out.println("Установите облегченную версию приложения по ссылке");

    }else {
            System.out.println("Установите обычную версию приложения по ссылке");
            return;}}

            public static void main (String[]args){
                System.out.println("Задача №1!");

                task1(2020);

                System.out.println("Задача №2!");

                task2YearOfRelease(2022);
                task2СheckingOS(1);


            }
        }