package tdd.bonus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TeamBonusCalculatorTest {

    @Test
    public void calculate_shouldReturnZero_whenSalesIsSmallerThanQuota() {
        TeamBonusCalculator teamBonusCalculator=new TeamBonusCalculator(1000);
        assertThat(teamBonusCalculator.calculate(900)).isEqualTo(0);
    }

    @Test
    public void calculate_shouldReturnZero_whenSalesEqualsQuota() {
        TeamBonusCalculator teamBonusCalculator=new TeamBonusCalculator(1000);
        assertThat(teamBonusCalculator.calculate(1000)).isEqualTo(0);
    }


    @Test
    public void calculate_shouldReturnValue_whenSalesMoreThanQuota() {
        TeamBonusCalculator teamBonusCalculator=new TeamBonusCalculator(11000,4,10);
        assertThat(teamBonusCalculator.calculate(12000)).isEqualTo(25);
    }

    @Test
    public void calculate_shouldReturn100_whenSalesMoreThanQuota() {
        TeamBonusCalculator teamBonusCalculator=new TeamBonusCalculator(11000,5,50);
        assertThat(teamBonusCalculator.calculate(12000)).isEqualTo(100);
    }

    @Test
    public void calculate_shouldReturnZero_whenTeamMembersIsZero() {
        TeamBonusCalculator teamBonusCalculator=new TeamBonusCalculator(11000,0,10);
        assertThat(teamBonusCalculator.calculate(12000)).isEqualTo(0);
    }

}
