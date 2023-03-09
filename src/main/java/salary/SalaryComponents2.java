package salary;

public class SalaryComponents2 extends SalaryComponents1{

	private double hra;
	private double pf;
	
	
	public double calculateHRA() {
		
		hra=0.05*getBasicPay(); 
		return hra;
	}
	
	public double calculatePF() {
		
		pf=0.2*getBasicPay(); 
		return pf;
	}
	
	
}
