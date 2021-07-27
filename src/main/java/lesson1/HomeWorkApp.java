package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        // 2 задание

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        // 3 задание
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void checkSumSign() {
            int a = 1;
            int b = 2;
            int c = a + b;
            if (c >= 0) {
                System.out.println("сумма положительная");
            } else {
                System.out.println("сумма отрицательная");
            }
        }

    // 4 задание

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("желтый");
        }
          else {
            System.out.println("зеленый");
        }
    }
    // 5 задание
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a>=b) {
            System.out.println("a" + ">=" + "b");
        }
        else {
                System.out.println("a" + "<"+ "b");
            }
        }
    



}
