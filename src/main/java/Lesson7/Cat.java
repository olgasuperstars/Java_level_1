package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean ate;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public boolean isAte() {
        return ate;
    }

    public void setAte(boolean ate) {
        this.ate = ate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void eat(Plate plate) {

        if (this.appetite > plate.getAmountOfFood()) {

        }
        plate.decreaseAmountOfFood(this.appetite);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
