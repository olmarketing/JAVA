package Seminar2;// Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

// Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().


public class lesson {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        System.out.println(str1.equals(str2));

        String str3 = "dlroW olleH";
        System.out.println(str1.equals(new StringBuilder(str3).reverse().toString()));

        int num1 = 3;
        int num2 = 56;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb1.append(num1).append("+").append(num2).append("=").append(num1 + num2);
        sb2.append(num1).append("-").append(num2).append("=").append(num1 - num2);
        sb3.append(num1).append("*").append(num2).append("=").append(num1 * num2);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        sb1.insert(sb1.indexOf("=")," равно ").deleteCharAt(sb1.indexOf("="));
        sb2.insert(sb2.indexOf("=")," равно ").deleteCharAt(sb2.indexOf("="));
        sb3.insert(sb3.indexOf("=")," равно ").deleteCharAt(sb3.indexOf("="));
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        sb1.replace(sb1.indexOf("="), sb1.indexOf("=") + 1, "равно");
        sb2.replace(sb2.indexOf("="), sb2.indexOf("=") + 1, "равно");
        sb3.replace(sb3.indexOf("="), sb3.indexOf("=") + 1, "равно");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }
}
