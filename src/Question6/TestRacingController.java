package Question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRacingController {
    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(new Horse(), new Tiger());
        Animal winner = RacingController.getWinner(animalList);
        System.out.println("The winner is: "+ winner.getName());
        System.out.println("The winner is: "+ winner.getSpeech());
    }
}
