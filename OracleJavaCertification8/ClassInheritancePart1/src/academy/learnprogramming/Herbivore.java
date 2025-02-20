package academy.learnprogramming;

public interface Herbivore {

    default void eatPlants() {
        System.out.println("Eating plants");
    }

//    default int getRequiredAmount();
//    public int getRequiredAmount() {
//        return;
//    }

}
