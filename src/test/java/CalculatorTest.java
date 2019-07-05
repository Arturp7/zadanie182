import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void shouldWorkFor500() {
        //given
        //then
        calculator.calculation(500);
        //result
        Assertions.assertThat(calculator.calculation(500)).isEqualTo(0);
    }
    @Test
    void shouldWorkFor3091() {
        //given
        //then
        calculator.calculation(3091);
        //result
        Assertions.assertThat(calculator.calculation(3091)).isEqualTo(0);
    }
    @Test
    void shouldWorkFor3092() {
        //given
        //then
        calculator.calculation(3092);
        //result
        Assertions.assertThat(calculator.calculation(3092)).isEqualTo(0.5399999999999636);
    }



@Test
    void shouldWorkFor14839_02() {
        //given
        //then
        calculator.calculation(85528);
        //result
        Assertions.assertThat(calculator.calculation(85528)).isEqualTo(14839.019999999999);
    }


}
