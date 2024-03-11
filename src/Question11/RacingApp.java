package Question11;

import java.security.SecureRandom;
import java.util.Arrays;

import  static Question11.ForestAnimal.Builder;

public class RacingApp {

    public static void main(String[] args) {
        ForestAnimal horse = new Builder().setName("Con ngua").setSpeech(generationAnimalSeech(60))
                .setFlyable(false).build();
        ForestAnimal tiger = new Builder().setName("Con ho").setSpeech(generationAnimalSeech(100))
                .setFlyable(false).build();
        ForestAnimal eagle = new Builder().setName("Con eagle").setSpeech(generationAnimalSeech(70))
                .setFlyable(false).build();

        ForestAnimal thewinner = new ForrestRacingController().getWinner(Arrays.asList(horse,tiger,eagle));
        System.out.println(thewinner);
    }

    private static int generationAnimalSeech(int maxSpeech){
        return new SecureRandom().nextInt(maxSpeech) +1;
    }
}
