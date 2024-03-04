package Question7;

public class RobotDog {

    public static int dogId = 0;
    private String name;

    public RobotDog() {
        dogId++;
    }

    public static int getDogId() {
        return dogId;
    }
}
