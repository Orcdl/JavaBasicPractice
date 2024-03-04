package Question8;

public class LoginPageController {
    private String username;
    private String password;

    public LoginPageController(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void loginwithCreds(LoginPage loginPage){
        loginPage.inputUsername(this.username);
        loginPage.inputPassword(this.password);
        loginPage.clickBtn();
    }
}
