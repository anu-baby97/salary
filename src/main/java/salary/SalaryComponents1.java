package salary;

public class SalaryComponents1 {
	private double basic_pay;
	private double deduction;
	private double bonus;
	
	public void setComponents(double b, double d, double bo) {
		basic_pay=b;
		deduction=d;
		bonus=bo;
	}
	
	public double getBasicPay() {
		return basic_pay;
	}
	public double getDeduction() {
		return deduction;
	}
	public double getBonus() {
		return bonus;
	}
	
	
}
