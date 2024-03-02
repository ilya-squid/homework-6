public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // task 2
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // task 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        // task 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // task 5
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }
        // task 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        // task 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        // task 8
        System.out.println("Задача 8");
        int perMonth = 29000;
        int inTheBank = 0;
        for (int i = 1; i <= 12; i++) {
            inTheBank += perMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + inTheBank + " рублей");
        }
        // task 9
        System.out.println("Задача 9");
        perMonth = 29000;
        int bank = 0;
        for (int i = 1; i <= 12; i++) {
            bank += perMonth;
            perMonth *= 1.01;
            System.out.println("Месяц " + i + " сумма накоплений равна " + bank + " рублей");
        }
        // task 10
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            int equally = i * 2;
            System.out.println("2 * " + i + " = " + equally);
        }
    }
}