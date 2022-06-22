package lab_07_02;

public class Main {

    public static void main(String[] args) {
        Animal concho = new Animal("cho", 60, false);
        Animal conho = new Animal("ho",100,false);
        Animal conngua = new Animal("ngua",75, false);
        Animal conchom = new Animal("chim",10, true);

        Animal[] list = { concho, conho, conngua, conchom};
        Controller col = new Controller(list);
        col.findMaxSpped();
    }
}
