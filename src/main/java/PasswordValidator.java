public class PasswordValidator {

    public String validate(String password) {

        int remainChars = validateLength(password);
        if (remainChars != 0) {
            return Integer.toString(remainChars);
        }

        return "success";
    }

    public static int validateLength(String password) {
        int remainChars = 6 - password.length();

        return Math.max(remainChars, 0);

    }

}
