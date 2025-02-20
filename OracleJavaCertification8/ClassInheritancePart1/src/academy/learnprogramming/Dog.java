package academy.learnprogramming;

public abstract class Dog extends Animal implements HasTail, CanRun{

    public Dog(int age) {
        super(age);
        System.out.println("Dog");
//        this.age = age;
    }

    @Override
    public int getTailLength() {
        return 5;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }

    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }
}
