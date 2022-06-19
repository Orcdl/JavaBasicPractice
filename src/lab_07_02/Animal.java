package lab_07_02;

import java.security.SecureRandom;

public class Animal {
    public Animal(){
    }
    public int speed() {
        return new SecureRandom().nextInt();
    }

}
