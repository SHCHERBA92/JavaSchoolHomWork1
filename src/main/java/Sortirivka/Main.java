package Sortirivka;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("•\tНаписать сортировку пузырьком или бинарный поиск элемента в массиве.");
        // Сделать паузу
        System.out.print("Введите колчество элементов в массиве : \t");
        Scanner scanner = new Scanner(System.in);
        int numberOfElement = scanner.nextInt();
        int [] mass = new int [numberOfElement];
        System.out.println();
        System.out.print("Вводите значения элементов :");
        for (int i = 0; i < numberOfElement; i++)
        {
            mass[i] = scanner.nextInt();
        }

        Sortirovka sortirovka = new Sortirovka(mass);
        long startTime, endTime, resTime;
        startTime = System.nanoTime();

        System.out.println(Arrays.toString(sortirovka.sortirovkaPuzirkomToUp()));
        System.out.println(Arrays.toString(sortirovka.sortirovkaPuzirkomToDown()));

        endTime = System.nanoTime();
        resTime = (endTime - startTime)/1000;
        System.out.println("Время  выполнения : " + resTime + "МикроСекунд");

        startTime = System.nanoTime();

        System.out.println(Arrays.toString(sortirovka.fasterSortirovkaPuzirkomToUp()));
        System.out.println(Arrays.toString(sortirovka.fasterSortirovkaPuzirkomToDown()));

        endTime = System.nanoTime();
        resTime = (endTime - startTime)/1000;
        System.out.println("Время  выполнения : " + resTime + "МикроСекунд");


    }
}
