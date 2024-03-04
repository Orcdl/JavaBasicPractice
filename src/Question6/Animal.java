package Question6;

public class Animal {
    private String name;
    private int speech;

    public Animal() {
    }

    public Animal(String name, int speech) {
        this.name = name;
        this.speech = speech;
    }

    public String getName() {
        return name;
    }

    public int getSpeech() {
        return speech;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeech(int speech) {
        this.speech = speech;
    }
}
