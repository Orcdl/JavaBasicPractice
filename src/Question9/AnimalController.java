package Question9;

import java.util.List;

public class AnimalController {
    private String AnimalName;
    private int AnimalSpeech;
    private boolean AcheckFlyable;

    public AnimalController(String animalName, int animalSpeech, boolean acheckFlyable) {
        AnimalName = animalName;
        AnimalSpeech = animalSpeech;
        AcheckFlyable = acheckFlyable;
    }
    public void whichanimalisWinner(Animal animal){
        animal.inputName(this.AnimalName);
        animal.inputSpeech(this.AnimalSpeech);
        animal.checkFlyable(this.AcheckFlyable);
    }
}
