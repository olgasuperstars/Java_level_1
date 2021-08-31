package Lesson7;

public class Plate {
    private int amountOfFood;

    public Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }
    public void decreaseAmountOfFood(int amount){
        this.amountOfFood -= amount;
    }

    public void addFood(int amount){
        this.amountOfFood += amount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "amountOfFood=" + amountOfFood +
                '}';
    }
}
