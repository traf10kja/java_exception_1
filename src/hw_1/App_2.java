package hw_1;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App_2 {
    public static void main(String[] args) throws Exception {
        numberIsBack();
        putStrings();

        /*Задание 2
        Можно ничего не менять, так как ArithmeticException отлавливается в блоке catch.
        Но можно изменить значение переменной d(строка 17) чтобы метод работал.
        Также создать массив intArray[](строка 18). Ещё одним маленьким нюансом будет замена out На err в строке 22.
        */
        try {
            int d = 1;
            int[] intArray = {1,2,3,4,5,6,7,8,9,55,54,12};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("Catching exception: " + e);
        }

        /*Задание 3
        Нам нужно сделать лишь одно ключевое преобразование передвинуть блок catch (Throwable ex),
        на последнее место, чтобы остальные блоки catch могли обработать свои исключения.
        Также можно изменить вывод в блоках catch с out на err.
        */
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }


    /*Задание 1
    */
    public static float numberIsBack (){
        Scanner sc = new Scanner(System.in);
        float number = 0.0f;
        System.out.println("Введите дробное число");
        boolean isCorrect = false;
        do {
            try {
                number = sc.nextFloat();
                isCorrect = true;
            }
            catch (InputMismatchException e){
                System.err.println("Указано не дробное число");
                isCorrect = false;
                sc.nextLine();
            }
        } while (!isCorrect);

        System.out.println("Вы ввели: " + number);
        return number;

    }
    /* 2.
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    */
    public static void putStrings (){
        Scanner sc = new Scanner(System.in);
        String s = null;
        System.out.println("Введите строку");
        boolean isCorrect = true;
        while (isCorrect) {
                s = sc.nextLine();
                s = s.trim();
                if (s.isEmpty()) {
                    throw new IllegalArgumentException("Пустые строки вводить нельзя");
                }
                isCorrect = false;
            }

    }
}
