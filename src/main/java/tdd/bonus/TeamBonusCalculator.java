package tdd.bonus;

public class TeamBonusCalculator {

	private final int quota;
	private int teamMembersNumber;
	private int commissionPercentage;

	public TeamBonusCalculator(final int quota){
		this.quota = quota;
	}

	public TeamBonusCalculator(final int quota,final int teamMembersNumber, final int commissionPercentage){
		this.quota = quota;
		this.teamMembersNumber = teamMembersNumber;
		this.commissionPercentage = commissionPercentage;
	}

	public double calculate(final int sales) {
		if(sales<=quota || teamMembersNumber==0) return 0;
		else return ((sales-quota)*getCommissionPercentageValue())/teamMembersNumber;
	}

	private double getCommissionPercentageValue() {
		return (double) commissionPercentage/100;
	}

}
