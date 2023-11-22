package com.teachmeskills.lesson_7.task_1;

import java.util.Scanner;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
 * Имплементировать этот метод в созданные классы.
 * Создать класс-раннер с методом мейн для запуска программы.
 * Запросить с консоли код должности и вывести название должности на экран.
 */

public class Runner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the code of job title:");
        System.out.println("0-Director");
        System.out.println("1-Worker");
        System.out.println("2-Accountant");

        int n= scanner.nextInt();

        Director director=new Director();
        Worker worker=new Worker();
        Accountant accountant=new Accountant();

        switch (n){
            case (0):
                director.showJobTitle();
                break;
            case (1):
                worker.showJobTitle();
                break;
            case (2):
                accountant.showJobTitle();
                break;
            default:
                System.out.println("Wrong code number!");
        }
    }

}
