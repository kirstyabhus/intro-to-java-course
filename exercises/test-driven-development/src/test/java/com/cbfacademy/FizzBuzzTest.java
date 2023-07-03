package fizzbuzz.src.test.java;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import fizzbuzz.src.main.java.FizzBuzz;

@DisplayName(value = "the Fizz kata should")
public class FizzBuzzTest {
    @Test
    @DisplayName("return 1 when input is 1")
    public void return1WhenInputIs1() {
        final String actual = FizzBuzz.of(1);
        assertThat(actual, is("1"));
    }
}
