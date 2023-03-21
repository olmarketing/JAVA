        package Seminar3;

import java.util.*;

public class lesson3 {
    public static void main(String[] args) {
// 1. Реализовать алгоритм сортировки списков компаратором.
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);

// 2.Пусть дан произвольный список целых чисел, удалить из него чётные числа
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list2.add(new Random().nextInt(20));
        }
        System.out.println(list2);

        Iterator<Integer> iterator= list2.iterator();
        while (iterator.hasNext()){
            int n=iterator.next();
            if (n%2==0){
                iterator.remove();
            }
        }

        System.out.println(list2);
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list3.add(new Random().nextInt(20));
        }
        System.out.println(list3);
        int min=Collections.min(list3);
        System.out.println("Минимальный элемент " + min);
        int max=Collections.max(list3);
        System.out.println("Максимальный элемент " + max);
        int sum = 0;
        for (int i = 0; i < list3.size(); i++) {
            sum += list3.get(i);
        }
        double average = (double) sum / list3.size();
        System.out.println("Средний элемент " + average);

// 4.Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        ArrayList<Integer> group1=new ArrayList<>();
        group1.add(4);
        group1.add(5);
        group1.add(11);
        group1.add(8);
        System.out.println(group1);
        ArrayList<Integer> group2=new ArrayList<>();
        group2.add(4);
        group2.add(5);
        group2.add(7);
        group2.add(6);
        System.out.println(group2);
        ArrayList<Integer> mergedGroup=new ArrayList<>();
        mergedGroup.addAll(group1);
        for (Integer item : group2) {
            if (!group1.contains(item)) {
                mergedGroup.add(item);
            }
        }

        System.out.println(mergedGroup);
// 5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        ArrayList<Integer> nullLists = new ArrayList<Integer>();
        long arrayTimeBegin = System.currentTimeMillis();;
        for (int i = 0; i < 10000; i++) {
            nullLists.add(0, 0);
        }
        long arrayTimeEnd = System.currentTimeMillis();
        System.out.println(nullLists);
// 6. Повторить пятый пункт но с LinkedList.
        long linkedTimeBegin = System.currentTimeMillis();;
        LinkedList<Integer> nullList=new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            nullList.addFirst(0);
        }
        long linkedTimeEnd = System.currentTimeMillis();
        System.out.println(nullList);
// 7. Сравнить время работы пятого и шестого пунктов.
        System.out.println("Время работы ArrayList = " + (arrayTimeEnd-arrayTimeBegin));
        System.out.println("Время работы LinkedList = " + (linkedTimeEnd-linkedTimeBegin));
    }

}
