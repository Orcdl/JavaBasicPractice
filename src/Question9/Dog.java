package Question9;

import java.security.SecureRandom;

public class Dog extends Animal{
    public static String DOG_name = "Chó Lulu";
    public static int D_MAX_SPEECH = 75;
    public static int DOG_speech = new SecureRandom().nextInt(D_MAX_SPEECH);
    public static boolean DOG_checkfly = false;

    @Override
    public void inputName(String name) {

    }

    @Override
    public void inputSpeech(int speech) {

    }

    @Override
    public void checkFlyable(boolean flyable) {

    }
}
