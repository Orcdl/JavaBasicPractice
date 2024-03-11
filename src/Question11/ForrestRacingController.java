package Question11;


import java.util.ArrayList;
import java.util.List;
public class ForrestRacingController {
    public ForestAnimal getWinner(List<ForestAnimal> forestAnimalList){
        ForestAnimal winner = null;
        List<ForestAnimal> eligibleRacingAnimal = getEligibleRacingAnimal(forestAnimalList);
        return winner;
    }

    private List<ForestAnimal> getEligibleRacingAnimal(List<ForestAnimal> forestAnimalList){
        List<ForestAnimal>eligibleRacingAnimal = new ArrayList<>();
        for (ForestAnimal forestAnimal : forestAnimalList) {
            if(!forestAnimal.isFlyable()){
                eligibleRacingAnimal.add(forestAnimal);
            }
        }
        return eligibleRacingAnimal;
    }
}
