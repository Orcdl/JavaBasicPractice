package lab_06;
//String url = "https://google.com";
//Check http OR https; domain name, .com OR .net
public class lab_06_04 {
    public static void main(String[] args) {

        String url = "https://google.com";
        String[] firstArray = url.split(":");
        if(firstArray[0].equals("https")) {
            System.out.println("This is the https");
        } else {
            System.out.println("This is not the https");
        }

        String[] secondArray = url.split("\\.");
        String coverted = "." + secondArray[1] ;
        if(coverted.equals(".com")) {
            System.out.println("This is the right result");
        } else if (coverted.equals(".net")) {
            System.out.println("This is wrong result");
        } else {
            System.out.println("Not support result");
        }

    }

}
