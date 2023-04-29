import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int [] number = new int[3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;

        double [] weight = {1.57, 7.654, 9.986};

        int [] home = {14, 25, 36};
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int [] number = new int[3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double [] weight = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int [] home = {14, 25, 36};
        for (int i = 0; i < home.length; i++) {
            System.out.print(home[i]);
            if (i != home.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int [] number = new int[3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();

        double [] weight = {1.57, 7.654, 9.986};
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int [] home = {14, 25, 36};
        for (int i = home.length - 1; i >= 0; i--) {
            System.out.print(home[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        for (int index = 0; index < number.length; index++) {

            if (number[index] % 2 != 0) {
                number[index] = number[index] + 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
