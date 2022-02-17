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

        boolean containCapitalLetter = hasCapitalLetter(password);
        if (!containCapitalLetter) {
            return "Error: Must contain at least 1 capital letter";
        }

        boolean containSpecialCharacter = hasSpecialCharacter(password);
        if (!containSpecialCharacter) {
            return "Error: Must contain at least 1 special character";
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

    public static boolean hasCapitalLetter(String password) {
        char[] chars = password.toCharArray();
        boolean containCapitalLetter = false;

        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                containCapitalLetter = true;
            }
        }

        return containCapitalLetter;
    }

    public static boolean hasSpecialCharacter(String password) {
        return password.matches("[a-zA-Z.? ]*");
    }

}
