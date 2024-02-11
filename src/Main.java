public class Main {
    public static void main(String[] args) {
        //ЗАДАЧА 1
        System.out.println("ЗАДАЧА 1");
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //ЗАДАЧА 2
        System.out.println("ЗАДАЧА 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear<2015){
            System.out.println("Установите облегчённую версию приложения для ");
            if (clientOS == 0){
                System.out.println("iOS по ссылке");
            }else {
                System.out.println("Android по ссылке");
            }
        }else{
            if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        //ЗАДАЧА 3
        System.out.println("ЗАДАЧА 3");
        int year = 2021;
        System.out.println(year+" год ");
        if(year>1584){
            if(((year%100!=0)&&(year%4==0))||(year%400==0)){
                System.out.println("является високосным");
            }else{
                System.out.println("не является високосным");
            }
        }
        //ЗАДАЧА 4
        System.out.println("ЗАДАЧА 4");
        int deliveryDistance = 10;
        if(deliveryDistance<=100){
            System.out.println("Потребуется дней: ");
            if (deliveryDistance<=20) {
                System.out.println(1);
            } else if (deliveryDistance<=60) {
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }else{
            System.out.println("Доставки нет");
        }
        //ЗАДАЧА 5
        System.out.println("ЗАДАЧА 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }

    }
}