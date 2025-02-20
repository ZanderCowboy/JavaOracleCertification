package academy.learnprogramming;

public class Husky extends Dog{

    public Husky(int age) {
//        this(); this is for constructors
        super(age); // this is for the parent class
        System.out.println("Husky");
    }

    @Override
    public void eat() {
//        super.eat(); // not using the logic or code from the parent class
        System.out.println("Husky is eating");

        super.eat();
    }

    @Override
    public int getWeight() {
        return 30;
    }

    @Override
    public int getTailLength() {
        return 20;
    }

    @Override
    public void run(int speed) {
        System.out.println("Husky running at speed= " + speed);
    }

    @Override
    public void printName() {
        System.out.println("Husky name= " + getName());
    }
}
