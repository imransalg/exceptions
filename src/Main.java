public class Main {
    public static void main(String[] args) {

        boolean result = Validator.validate("LogiN_123", "paSSworD_321", "paSSworD_322");
        if (result) {
            System.out.println("Логин и пароль корректные!");
        }
    }
}