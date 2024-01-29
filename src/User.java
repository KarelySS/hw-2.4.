import exception.WrongLoginException;
import exception.WrongPasswordException;
public class User {
    private String login;
    private String password;
    private String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void userInfo(String login, String password, String confirmPassword) {
        int loginLength = login.length();
        if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongLoginException();
        }
        int passwordLength = password.length();
        if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongPasswordException();
        }
        int cofirmPasswordLength = confirmPassword.length();
        if (!confirmPassword.matches("^[a-zA-Z0-9_]{1,20}$") || !confirmPassword.equals(password)) {
            throw new WrongPasswordException();
        }
    }
}
