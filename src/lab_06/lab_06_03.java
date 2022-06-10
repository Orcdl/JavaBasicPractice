package lab_06;

//String myStr = "100 minutes";
//NOT using REGEX, extract digit character from that String
//Expected output: "100".
//EX: "12345nabc678" -> "12345678"

public class lab_06_03 {
    public static void main(String[] args) {
        String myString = "100 mintues";
        String[] newArray = myString.split("");
        String result = "";
        for(int i = 0; i< newArray.length;i++){
            try {
                result += Integer.parseInt(newArray[i]);
            } catch (NumberFormatException e){
                continue;
            }
        }
        System.out.println(result);
    }
}
