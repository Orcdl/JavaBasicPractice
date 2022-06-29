package lab_08;

import java.util.ArrayList;
import java.util.List;
//import static lab_08.Animal8.aBuilder;

public class TestAnimal8Builder {
    public static void main(String[] args) {
        Animal8.aBuilder animalBuilder = new Animal8.aBuilder();
        animalBuilder.setFlyable(false);
        List<Animal8> animal8s = new ArrayList<Animal8>();
        animal8s.add(animalBuilder.setSpeed(100).setName("tiger").build());
        animal8s.add(animalBuilder.setSpeed(75).setName("horse").build());
        animal8s.add(animalBuilder.setSpeed(60).setName("dog").build());

        animalWinner(animal8s);

    }
    public static void animalWinner(List<Animal8> animal8s) {
        int maxSpeed = 0;
        String animalname = null;
        for (Animal8 animal8 : animal8s) {
            if(animal8.isFlyable() == false){
                if(maxSpeed < animal8.getSpeed()){
                    maxSpeed = animal8.getSpeed();
                    animalname = animal8.getName();
                }
            }
        }
        System.out.println("Winner is: " + animalname);
    }
}