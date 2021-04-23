import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "121212";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль:");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(password)) {
            System.out.println("Пароль верный");

        } else if (inputPassword.length() > password.length()) {
            System.out.println("Пароль неверный, слишком длинный");

        } else if (inputPassword.length() < password.length()) {
            System.out.println("Пароль неверный, слишком короткий");

        } else {
            System.out.println("Пароль неверный.");
        }
    }
}