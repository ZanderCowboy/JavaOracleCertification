package academy.learnprogramming;

public class Eagle extends Bird{

    public int fly(int height) { // overloading
        System.out.println("Eagle is flying at " + height + " meters");
        return height;
    }

//    @Override
//    public int eat(int amount) {
//
//        return amount;
//    }


}
