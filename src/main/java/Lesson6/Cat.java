package Lesson6;

public class Cat extends Animals {
    public static int count = 0;
      public Cat(String name) {
        super(name);
        count++;
    }

    public Cat() {

    }


    @Override
    public int runLength() {
        return 0;
    }

    @Override
    public void runLength(int length) {

        if(length > 200)

    {
        System.out.println(name + " cant run");
    }
        else

    {
        System.out.println(name + " runs " + length);

    }
}

    @Override
    public void swimLength(int length) {
        System.out.println(name + " cant swim");
    }


}
