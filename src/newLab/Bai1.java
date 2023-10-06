package newLab;

public class Bai1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int tong = 0;
        for(int index=0; index<=b; index++ ){
            tong = a+ index;
//            System.out.println("vòng " + index++ );
        }
        System.out.println(tong);
    }
}

