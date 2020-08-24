package tdd.bonus;

public class BonusCalculator {

	private final int commissionPercentage;
	private final int taxPercentage;
	private final int quota;

	public BonusCalculator(final int commissionPercentage, final int quota, final int taxPercentage) {
	this.commissionPercentage=commissionPercentage;
	this.quota=quota;
	this.taxPercentage=taxPercentage;
	}

	public double calculate(final int sales) {
		if(sales<=quota) return 0;
		else return ((sales-quota)*getCommissionPercentageValue())*getTaxPercentageValue();
	}

	private double getCommissionPercentageValue() {
		return (double)commissionPercentage/100;
	}
	private double getTaxPercentageValue() {
		return (double)(100-taxPercentage)/100;
	}
}
