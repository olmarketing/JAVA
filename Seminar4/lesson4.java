import java.util.*;

public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> surnames = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> patronymics = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();
        List<Character> genders = new ArrayList<>();

        System.out.println("Введите данные в формате: Фамилия Имя Отчество Возраст Пол (M или F). Нажмите q для завершения");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equals("q")) {
                break;
            }

            String[] parts = line.split(" ");
            if (parts.length != 5) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз.");
                continue;
            }

            String surname = parts[0];
            String name = parts[1];
            String patronymic = parts[2];
            int age;
            char gender;

            try {
                age = Integer.parseInt(parts[3]);
                gender = parts[4].charAt(0);
            } catch (NumberFormatException | StringIndexOutOfBoundsException ex) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз.");
                continue;
            }

            surnames.add(surname);
            names.add(name);
            patronymics.add(patronymic);
            ages.add(age);
            genders.add(gender);
        }

        System.out.println("Несортированный список:");

        for (int i = 0; i < surnames.size(); i++) {
            System.out.printf("%s %s.%s. %d %c\n", surnames.get(i), names.get(i).charAt(0), patronymics.get(i).charAt(0), ages.get(i), genders.get(i));
        }

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < surnames.size(); i++) {
            indices.add(i);
        }

        Collections.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int genderCompare = Character.compare(genders.get(o1), genders.get(o2));
                if (genderCompare == 0) {
                    int ageCompare = Integer.compare(ages.get(o1), ages.get(o2));
                    if (ageCompare == 0) {
                        return surnames.get(o1).compareTo(surnames.get(o2));
                    }
                    return ageCompare;
                }
                return genderCompare;
            }
        });

        System.out.println("Список, отсортированный по полу и возрасту:");

        for (int i : indices) {
            System.out.printf("%s %s.%s. %d %c\n", surnames.get(i), names.get(i).charAt(0), patronymics.get(i).charAt(0), ages.get(i), genders.get(i));
        }
    }
}
