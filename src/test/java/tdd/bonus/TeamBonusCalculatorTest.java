package tdd.bonus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TeamBonusCalculatorTest {

    @Test
    public void calculate_shouldReturnZero_whenSalesIsSmallerThanQuota() {
        TeamBonusCalculator teamBonusCalculator=new TeamBonusCalculator();
        assertThat(teamBonusCalculator.calculate(1000)).isEqualTo(0);
    }

}
