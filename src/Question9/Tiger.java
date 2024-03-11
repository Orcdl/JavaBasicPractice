package Question9;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public static String TIGER_name = "Hổ Haha";
    public static int T_MAX_SPEECH = 75;
    public static int TIGER_speech = new SecureRandom().nextInt(T_MAX_SPEECH);
    public static boolean TIGER_checkfly = false;

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
