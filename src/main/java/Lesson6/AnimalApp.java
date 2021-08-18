package Lesson6;

public class AnimalApp {
    public static void main(String[] args) {
Cat Vanya = new Cat("Vanya");
Cat Mefosha = new Cat("Mefosha");
Vanya.runLength(200);
Vanya.runLength(300);
Mefosha.swimLength(0);
Dog Reks = new Dog("Reks");
Reks.runLength(505);
Reks.swimLength(8);
Reks.run();
Vanya.run();
        System.out.println(Cat.count);
        System.out.println(Dog.count);
        System.out.println(Animals.count);
    }
}
