public class PasswordValidator {

    public String validate(String password) {

        int remainChars = validateLength(password);
        if (remainChars != 0) {
            return Integer.toString(remainChars);
        }

        boolean containNumber = hasNumber(password);
        if (!containNumber) {
            return "Error: Must contain at least 1 digit";
        }

        boolean containLowercaseLetter = hasLowercaseLetter(password);
        if (!containLowercaseLetter) {
            return "Error: Must contain at least 1 lowercase letter";
        }

        return "success";
    }

    public static int validateLength(String password) {
        int remainChars = 6 - password.length();

        return Math.max(remainChars, 0);
    }

    // https://www.tutorialspoint.com/Check-if-a-string-contains-a-number-using-Java
    public static boolean hasNumber(String password) {
        char[] chars = password.toCharArray();
        boolean containNumber = false;

        for (char c : chars) {
            if (Character.isDigit(c)) {
                containNumber = true;
            }
        }

        return containNumber;
    }

    public static boolean hasLowercaseLetter(String password) {
        char[] chars = password.toCharArray();
        boolean containLowercaseLetter = false;

        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                containLowercaseLetter = true;
            }
        }

        return containLowercaseLetter;
    }

}
