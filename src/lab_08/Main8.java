package lab_08;

public class Main8 {

    public static void main(String[] args) {
        Animal8 dog= Animal8.builder()
                .withWings(false)
                .speed(80)
                .build();
        System.out.println("Dog: " + dog.toString());
    }

}

