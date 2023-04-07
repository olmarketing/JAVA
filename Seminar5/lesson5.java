import java.util.*;

public class lesson5 {

    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Светлана Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов");
        Map<String, List<String>> phoneBook = new HashMap<String, List<String>>();

        // заполняем телефонную книгу рандомными номерами
        for (String employee : employees) {
            int numOfPhones = new Random().nextInt(3) + 1; // от 1 до 3 телефонов на человека
            List<String> phones = new ArrayList<String>();
            for (int i = 0; i < numOfPhones; i++) {
                phones.add("+7"+"-" + "9"+(new Random().nextInt(10,99)) + "-" + (new Random().nextInt(899)) + "-" + (new Random().nextInt(8999)));
            }
            phoneBook.put(employee, phones);
        }

        // выводим телефонную книгу на экран
        System.out.println("Телефонная книга:");
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (String phone : entry.getValue()) {
                System.out.print(phone + ", ");
            }
            System.out.println();
        }

        // ищем повторяющиеся имена и выводим их с количеством повторений
        Map<String, Integer> nameCounts = new HashMap<String, Integer>();
        for (String employee : employees) {
            String[] nameParts = employee.split(" ");
            String firstName = nameParts[0];
            if (nameCounts.containsKey(firstName)) {
                nameCounts.put(firstName, nameCounts.get(firstName) + 1);
            } else {
                nameCounts.put(firstName, 1);
            }
        }
        System.out.println("Повторяющиеся имена:");
        List<Map.Entry<String, Integer>> nameCountsList = new ArrayList<Map.Entry<String, Integer>>(nameCounts.entrySet());
        Collections.sort(nameCountsList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : nameCountsList) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
            }
        }
    }
}
