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
    public static void main(String[] args) {
        System.out.println("Задача №1!");

        task1(2022);

    }
}