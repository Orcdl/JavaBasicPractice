package lab_08;

public class Animal8 {
    private int speed;
    private boolean flyable;

    protected Animal8(Builder builder) {
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    // Read only
    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "Animal8{" +
                "speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }

    //

    // Inner Class
    public static class Builder {
        private int speed = 0;
        private boolean flyable = false;

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal8 build() {
            return new Animal8(this);
        }
    }
}
