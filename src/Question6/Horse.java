package Question6;

import java.security.SecureRandom;

public class Horse extends Animal {
    final int MAX_SPEED = 100;
    public Horse() {
        this.setSpeech(new SecureRandom().nextInt(MAX_SPEED));
        this.setName("Con ngựa");
    }
}

