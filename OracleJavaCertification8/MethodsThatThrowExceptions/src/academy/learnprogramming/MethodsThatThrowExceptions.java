package academy.learnprogramming;

class NoMoreMeatException extends Exception {} // Checked Exception

class NoMorePlantsException extends RuntimeException {} // Unchecked Exception

interface Omnivore {
    void eatMeat(int amount) throws NoMoreMeatException;

    void eatPlants(int amount);
}

class Bear implements Omnivore {

    @Override
    public void eatMeat(int amount) throws NoMoreMeatException{
        if (amount <= 0) {
            throw new NoMoreMeatException();
        }
        System.out.println("Eating meat.");
    }

    @Override
    public void eatPlants(int amount) { // no need to throw since unchecked
        if (amount <= 0) {
            throw new NoMorePlantsException();
        }
        System.out.println("Eating plants.");
    }
}


public class MethodsThatThrowExceptions {
    public static void main(String[] args) {
        Bear bear = new Bear();

        try {
            bear.eatMeat(2);
            bear.eatPlants(-2);
        } catch (NoMorePlantsException e) {
            e.printStackTrace();
            System.out.println("No plants");
        } catch (RuntimeException e) {
            System.out.println("Runtime exception");
        }
        catch (NoMoreMeatException e) {
            e.printStackTrace();
            System.out.println("Bear is hungry. ");
        } finally {
            System.out.println("finally");
        }

    }


}
