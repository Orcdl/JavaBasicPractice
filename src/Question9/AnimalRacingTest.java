package Question9;

public class AnimalRacingTest {
    public static void main(String[] args) {
        AnimalController testAnimal = new AnimalController("tenconvat", 67, false);

        Animal Horse = new Horse();
        Animal Dog = new Dog();
        Animal Tiger = new Tiger();

        testAnimal.whichanimalisWinner(Horse);
        testAnimal.whichanimalisWinner(Dog);
        testAnimal.whichanimalisWinner(Tiger);
    }
}
