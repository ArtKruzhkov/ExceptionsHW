package HW02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {

        //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
        //Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя 
        //ввод данных.
        //(Сам метод реализован внизу кода)
        printNumber();





        // Если необходимо, исправьте данный код 
        // Задание 2
        //Исправленный код (просто добавил массив чтобы появился элемент, который нужно делить на d) дальше вроде все работает,
        //выкидывает исключение что нельзя делить на 0.
        // try {
        //     int[] intArray = new int[9];
        //     int d = 0;
        //     double catchedRes1 = intArray[8] / d;
        //     System.out.println("catchedRes1 = " + catchedRes1);
        // } catch (ArithmeticException e) {
        //     System.out.println("Catching exception: " + e);
        // }


        //Дан следующий код, исправьте его там, где требуется
        //Задание 3
        //Исправленный код (табуляция в методе printSum убираем оттуда throws FileNotFound тк метод не работает с файлом) убираем оттуда throws FileNotFound тк метод не работает с файлом)
        //в методе main убираем catch Throwable ex чтобы приложение обрабатывало только те исключения которые подходят под массив
        // try {

        //     int a = 90;
        //     int b = 3;
        //     System.out.println(a / b);
        //     printSum(23, 234);
        //     int[] abc = { 1, 2 };
        //     abc[3] = 9;
        // } catch (NullPointerException ex) {
        //     System.out.println("Указатель не может указывать на null!");
        // } catch (IndexOutOfBoundsException ex) {
        //     System.out.println("Массив выходит за пределы своего размера!");
        // }

    }
    
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void printNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter float number");
        try {
            Object num = in.nextFloat();
            if(num instanceof Float) {
                System.out.printf("You entered float number: %.2f\n", num);
                in.close();
            }
        } catch (InputMismatchException e) {
            System.out.println("YOU ENTERED NOT FLOAT NUMBER! TRY AGAIN!");
            printNumber();
        }
    }
}

