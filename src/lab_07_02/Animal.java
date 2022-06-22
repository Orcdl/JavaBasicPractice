package lab_07_02;

public class Animal {
    String name;
    int speed;
    boolean flyable;


    public Animal(String n, int sp, boolean fly) {
        name = n;
        speed = sp;
        flyable = fly;
    }

    public String isFlyable(){
        if (flyable == true) {
            return "fly";
        }
        return "not fly";
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}




