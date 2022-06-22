package lab_07_02;

import java.util.List;

public class Controller {
    Animal[] animaList;

    public Controller(Animal[] list) {
        animaList = list;
    }
    public void findMaxSpped() {
        int maxspeed = 0;
        Animal winner = new Animal("", 0, false);
        for (int i = 0; i < animaList.length -1 ; i++) {
            Animal temp = animaList[i];
            if (maxspeed < temp.getSpeed()) {
                maxspeed = temp.getSpeed();
                winner = temp;
            }

        }
        System.out.println("Winner is" + " " + winner.getName() + " , with speed:" + winner.getSpeed() +" , fly: " + winner.isFlyable());
    }
}
