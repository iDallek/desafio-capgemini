import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
    -● Possui no mínimo 6 caracteres.
    -● Contém no mínimo 1 digito.
    -● Contém no mínimo 1 letra em minúsculo.
    ● Contém no mínimo 1 letra em maiúsculo.
    ● Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
*/


public class PasswordValidatorTest {

    @Test
    @DisplayName("Should validate() returns the number of characters remaining on invalid password is provided")
    public void test1() {
        PasswordValidator SUT = new PasswordValidator();

        String input = RandomStringUtils.randomAscii(3);
        String input2 = RandomStringUtils.randomAscii(1);
        String input3 = RandomStringUtils.randomAscii(5);
        String input4 = RandomStringUtils.randomAscii(0);

        Assertions.assertEquals(SUT.validate(input), "3");
        Assertions.assertEquals(SUT.validate(input2), "5");
        Assertions.assertEquals(SUT.validate(input3), "1");
        Assertions.assertEquals(SUT.validate(input4), "6");
    }

    @Test
    @DisplayName("Should validate() returns string with error details if the password has no number provided")
    public void test2() {
        PasswordValidator SUT = new PasswordValidator();

        String input = "Ya3&ab".replaceAll("[0-9]","a");

        Assertions.assertEquals("Error: Must contain at least 1 digit", SUT.validate(input));
    }

    @Test
    @DisplayName("Should validate() returns string with error details if the password has no lowercase letter provided")
    public void test3() {
        PasswordValidator SUT = new PasswordValidator();

        String input = "Ya3&ab".replaceAll("[a-z]","A");

        Assertions.assertEquals("Error: Must contain at least 1 lowercase letter", SUT.validate(input));
    }

    @Test
    @DisplayName("Should validate() returns string with error details if the password does not have any capital letters provided")
    public void test4() {
        PasswordValidator SUT = new PasswordValidator();

        String input = "Ya3&ab".replaceAll("[A-Z]","a");

        Assertions.assertEquals("Error: Must contain at least 1 capital letter", SUT.validate(input));
    }

}
