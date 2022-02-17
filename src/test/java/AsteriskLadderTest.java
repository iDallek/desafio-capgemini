import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Question 01 - AsteriskLadder")
public class AsteriskLadderTest {

    @Test
    @DisplayName("Should create() return valid asterisk ladder if valid argument is provided")
    public void test2() {
        AsteriskLadder SUT = new AsteriskLadder();

        String[] validResult = {
                "  *\n" +
                " **\n" +
                "***\n",

                "   *\n" +
                "  **\n" +
                " ***\n" +
                "****\n",

                "    *\n" +
                "   **\n" +
                "  ***\n" +
                " ****\n" +
                "*****\n",

                "     *\n" +
                "    **\n" +
                "   ***\n" +
                "  ****\n" +
                " *****\n" +
                "******\n",
        };

        Assertions.assertEquals(SUT.create(3), validResult[0]);
        Assertions.assertEquals(SUT.create(4), validResult[1]);
        Assertions.assertEquals(SUT.create(5), validResult[2]);
        Assertions.assertEquals(SUT.create(6), validResult[3]);
    }

}
