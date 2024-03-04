package Question8;

public class LoginPageTest {
    public static void main(String[] args) {
        LoginPageController testFlow = new LoginPageController("username", "password");

        LoginPage internalloginPage = new InternalLoginPage();
        LoginPage externalloginPage = new ExternalLoginPage();

        testFlow.loginwithCreds(externalloginPage);
        testFlow.loginwithCreds(internalloginPage);
    }
}
