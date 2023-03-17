//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.Random;

public class lesson1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.println(i);

        int n = Integer.toBinaryString(i).length();
        System.out.println(n);

        int[] m1 = Multiples(n, i, Short.MAX_VALUE);
        printArray(m1);
        int[] m2 = NonMultiples(n, Short.MIN_VALUE, i);
        printArray(m2);
    }



    static int[] Multiples(int n1, int min, int max) {
        int size = 0;
        for (int i = min; i < max; i++) {
            if (i % n1 == 0)
                size++;
        }
        int[] multiples = new int[size];
        int index = 0;
        for (int i = min; i < max; i++) {
            if (i % n1 == 0)
                multiples[index++] = i;
        }
        return multiples;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int[] NonMultiples(int n1, int min, int max) {
        int size = 0;
        for (int i = min; i < max; i++) {
            if (i % n1 != 0)
                size++;
        }
        int[] nonMultiples = new int[size];
        int index = 0;
        for (int i = min; i < max; i++) {
            if (i % n1 != 0)
                nonMultiples[index++] = i;
        }
        return nonMultiples;
    }
}