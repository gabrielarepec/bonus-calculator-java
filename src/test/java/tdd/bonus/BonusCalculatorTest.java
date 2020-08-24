package tdd.bonus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BonusCalculatorTest {

    @Test
    public void calculate_shouldReturnZero_whenSalesIsSmallerThanQuota() {
        BonusCalculator bonusCalculator=new BonusCalculator(10,1200,10);
        assertThat(bonusCalculator.calculate(1000)).isEqualTo(0);
    }

    @Test
    public void calculate_shouldReturnZero_whenSalesEqualsQuota() {
        BonusCalculator bonusCalculator=new BonusCalculator(10,1000,10);
        assertThat(bonusCalculator.calculate(1000)).isEqualTo(0);
    }

    @Test
    public void calculate_shouldReturnValue_whenSalesEqualsQuota() {
        BonusCalculator bonusCalculator=new BonusCalculator(10,1000,10);
        assertThat(bonusCalculator.calculate(1000)).isEqualTo(0);
    }

    @Test
    public void calculate_shouldReturnValue_whenSalesMoreThanQuota() {
        BonusCalculator bonusCalculator=new BonusCalculator(10,11000,10);
        assertThat(bonusCalculator.calculate(12000)).isEqualTo(90);
    }
}
