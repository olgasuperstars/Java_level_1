package Lesson7;

public class App {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Vaska", 10),
                new Cat("Barsik", 15),
                new Cat("Boris", 5),
                new Cat("Cat'O'Dog", 20),
                new Cat("Vanya", 25)};
        Plate plate = new Plate(60);
        feedAllCats(cats, plate);
        System.out.println("Food left: " + plate.getAmountOfFood());
        System.out.println("Refill plate");
        plate.addFood(100);
        feedAllCats(cats, plate);
        System.out.println("Food left: " + plate.getAmountOfFood());
    }

    private static void feedAllCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            feedCat(cat, plate);
        }
        for (Cat cat : cats) {
            if (cat.isAte()) {
                System.out.println("Cat " + cat.getName() + " is ate");
            } else {
                System.out.println("Cat " + cat.getName() + " is hungry");
            }
        }
    }

    private static void feedCat(Cat cat, Plate plate) {
        if (cat.getAppetite() > plate.getAmountOfFood() || cat.isAte()) {
            return;
        }
        plate.decreaseAmountOfFood(cat.getAppetite());
        cat.setAte(true);
    }
}
