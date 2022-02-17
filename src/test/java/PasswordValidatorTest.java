import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    @DisplayName("Should validate() returns the number of characters remaining on invalid password is provided")
    public void test() {
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

}
