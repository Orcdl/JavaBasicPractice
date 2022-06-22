package lab_08;

public class Animal8 {
    private int speed;
    private boolean withWings;

    protected Animal8(Builder<?> builder) {
        this.speed = builder.speed;
        this.withWings = builder.withWings;
    }

    @Override
    public String toString() {
        return "isFlyable " + this.withWings + " and has speed is " + this.speed;
    }

    public static Builder builder() {
        return new Builder() {
            public Builder getThis() {
                return this;
            }
        };
    }

    public abstract static class Builder<T extends Builder<T>> {
        private int speed;
        private boolean withWings;

        public abstract T getThis();

        public T withWings(boolean withWings) {
            this.withWings = withWings;
            return this.getThis();
        }

        public T speed(int speed) {
            this.speed = speed;
            return this.getThis();
        }

        public Animal8 build() {
            return new Animal8(this);
        }
    }

}
