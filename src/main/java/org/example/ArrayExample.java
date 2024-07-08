package org.example;

public class ArrayExample {
    public static void main(String[] args) {
        // Създаване на масив с 20 елемента
        int[] array = new int[20];

        // Инициализация на всеки елемент със стойност индекс * 5
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        // Извеждане на елементите на масива в конзолата
        for (int i = 0; i < array.length; i++) {
            System.out.println("Елемент [" + i + "] = " + array[i]);
        }
    }
}
