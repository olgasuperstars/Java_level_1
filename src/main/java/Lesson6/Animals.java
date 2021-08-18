package Lesson6;

public abstract class  Animals {
    protected String name;
public static int count = 0;
    public Animals(String name) {
        this.name = name;
        count++;
    }

    public Animals() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Animal is running");
    }
    public void swim() {
        System.out.println("Animal is swimming");
    }
public abstract int runLength();

    public abstract void runLength(int length);

    public abstract void swimLength(int length);
}