package Lesson6;

public class Dog extends Animals {
    public static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }

    public Dog() {

    }

    @Override
    public int runLength() {
        return 0;
    }

    @Override
    public void runLength(int length) {
        if (length > 500) {
            System.out.println(name + " cant run");
        } else {
            System.out.println(name + " runs " + length);

        }
    }

        @Override
        public void swimLength ( int length){
            if (length > 10) {
                System.out.println(name + " cant swim");
            } else {
                System.out.println(name + " swims " + length);
            }

        }
    }
