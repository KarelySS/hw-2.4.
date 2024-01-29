import exception.WrongLoginException;
import exception.WrongPasswordException;
public class Main {
    public static void main(String[] args) {
        try {
            User.userInfo("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException e) {
            System.out.println("Логин введен некорректно." +
                    "Используйте цифры, латинские буквы и знак подчеркивания");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль введен некорректно." +
                    " Используйте цифры, латинские буквы и знак подчеркивания.");
        }

    }
}