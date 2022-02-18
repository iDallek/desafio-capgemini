import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Question 03 - CountAnagrams")
public class CountAnagramsTest {
    @Test
    @DisplayName("Should count() returns the number of anagrams found by single string")
    public void test() {
        CountAnagrams SUT = new CountAnagrams();

        String input = "ovo";
        String input2 = "ifailuhkqq";

        Assertions.assertEquals(SUT.count(input), 2);
        Assertions.assertEquals(SUT.count(input2), 3);
    }
}
