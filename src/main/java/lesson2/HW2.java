package lesson2;

public class HW2 {
    public static void main(String[] args) {
        boolean result = isBetween10And20(5, 10);
        System.out.println(result);
        boolean result1 = isBetween10And20(10, 12);
        System.out.println(result1);
        positiveOrNegativeNum(4);
        positiveOrNegativeNum(-4);
        boolean num = isPositiveOrNegativeNum(10);
        System.out.println(num);
        amountOfString("я уеду жить в США", 5);


    }

    // 1 задание
    static boolean isBetween10And20(int first, int second) {
        int sum = first + second;
        return sum >= 10 && sum <= 20;
    }

    // 2 задание
    static void positiveOrNegativeNum(int num) {
        if (num >= 0)
            System.out.println(num + " - положительное число");
        else
            System.out.println(num + " - отрицательное число");

    }

    // 3 задание
    static boolean isPositiveOrNegativeNum(int num) {
        if (num >= 0)
            return false;
        else
            return true;
    }

    // 4 задание
    static void amountOfString(String string, int amount) {

        for (int i = 0; i < amount; i++) {
            System.out.println(string);
        }
    }

}



