package HW01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW01 {
    public static void main(String[] args) {
        
        //Задача1
        // ArithmeticException
        // System.out.println(divide(54, 0));


        //ArrayIndexOutOfBoundsException
        // int[] array = new int[11];
        // System.out.println(getElement1(array, 15));


        //RuntimeException
        // int[] array = new int[11];
        // System.out.println(getElement2(array, 15));


        //Задача2
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {5, 6, 7, 8};
        System.out.println(Arrays.toString(diffArrays(array1, array2)));
        //Задача2 если массивы не равны
        int[] array3 = {10, 20, 30, 40, 50};
        int[] array4 = {5, 6, 7, 8};
        System.out.println(Arrays.toString(diffArrays(array3, array4)));
    }
    




    // 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    // ArithmeticException
    public static int divide(int a1, int a2) {
        return a1/a2;
    }


    //ArrayIndexOutOfBoundsException
    public static Integer getElement1(int[] array, int index) {
        return array[index];
    }

    //RuntimeException
    public static Integer getElement2(int[] array, int index) {
        int result;
        for (int i = 0; i < array.length; i++) {
            if(index == i) {
                result = array[i];
                return result;
            }
        }
        throw new RuntimeException("No elements with that index");
    }


    // 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
    // каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static Integer[] diffArrays(int[] array1, int[] array2) {
        if(array1.length != array2.length) {
            throw new RuntimeException("Not same size arrays!");
        }
        List<Integer> res = new ArrayList<>();
        for (int index = 0; index < array1.length; index++) {
            res.add(array1[index] - array2[index]);
        } 
        return res.toArray(new Integer[0]);
    }
}
