package lab_07_02;

public class Main {
    public static void main(String[] args) {
        Dog gaugau = new Dog();
        Horse hoho = new Horse();
        Tiger titi = new Tiger();

        Animal fastspeed;

        if (gaugau.speed() > hoho.speed()) {
            fastspeed = gaugau;
        } else fastspeed = hoho;

        if (titi.speed() > hoho.speed()) {
            fastspeed = titi;
        }
        System.out.println("Winner is" + " " + fastspeed.getClass().getSimpleName() + " , with speed:" + fastspeed.speed());

    }

    public static int max(int x, int y) {
        if (x > y) {
          return x;
        } else {
            return y;
        }
    }
}
