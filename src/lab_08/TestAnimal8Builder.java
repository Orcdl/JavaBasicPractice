package lab_08;

import java.util.ArrayList;
import java.util.List;

import static lab_08.Animal8.Builder;
public class TestAnimal8Builder {

    public static void main(String[] args) {
        Animal8 tiger = new Builder().setFlyable(false).setSpeed(100).build();
        Animal8 horse = new Builder().setFlyable(false).setSpeed(75).build();
        Animal8 dog = new Builder().setFlyable(false).setSpeed(60).build();

        List<Animal8> animal8s = new ArrayList<Animal8>();
        animal8s.add(tiger);
        animal8s.add(horse);
        animal8s.add(dog);
        for (Animal8 animal8 : animal8s) {
            
        }
    }
}
