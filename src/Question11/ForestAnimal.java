package Question11;

public class ForestAnimal {
    private String name;
    private int speech;
    private boolean flyable;

    protected ForestAnimal(Builder builder){
        this.name = builder.name;
        this.speech= builder.speech;
        this.flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeech() {
        return speech;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "ForestAnimal{" +
                "name='" + name + '\'' +
                ", speech=" + speech +
                ", flyable=" + flyable +
                '}';
    }

    public static class Builder{
        private String name;
        private int speech;
        private boolean flyable;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeech(int speech) {
            this.speech = speech;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public ForestAnimal build(){
            return new ForestAnimal(this);
        }
    }
}
