package Question6;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
        final int MAX_SPEED = 100;
        this.setSpeech(new SecureRandom().nextInt(MAX_SPEED));
        this.setName("Con hổ");
    }
}

