package Question9;

import java.security.SecureRandom;

public class Horse extends Animal{
    public static String HORSE_name = "Ngựa Hoho";
    public static int H_MAX_SPEECH = 100;
    public static int HORSE_speech = new SecureRandom().nextInt(H_MAX_SPEECH);
    public static boolean HORSE_checkfly = false;

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
