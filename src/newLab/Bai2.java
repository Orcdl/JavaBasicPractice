package newLab;

//Đề bài: Sử dụng For Loop để đảo một số nguyên cho trước

public class Bai2 {
    public static void main(String[] args) {
        int songuyen = 23586328;

        int songuyensaukhidao =0;

        while (songuyen!=0){
            int socuoicung = songuyen % 10;
            songuyensaukhidao = songuyensaukhidao *10 + socuoicung;
            songuyen /=10;
        }

        System.out.println("Số đảo ngược là " + songuyensaukhidao);
    }

}
