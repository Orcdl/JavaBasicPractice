package lab_08;

public class Animal8 {
    private int speed;
    private boolean flyable;
    private String name;

    protected Animal8(aBuilder builder) {
        this.speed = builder.speed;
        this.flyable = builder.flyable;
        this.name = builder.name;
    }

    // Read only

    public String getName() {
        return name;
    }

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
                ", name='" + name + '\'' +
                '}';
    }

    // Inner Class
    public static class aBuilder {
        private int speed = 0;
        private boolean flyable = false;

        private String name;

        public aBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public aBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public aBuilder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal8 build() {
            return new Animal8(this);
        }
    }
}