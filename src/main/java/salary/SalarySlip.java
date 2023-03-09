package salary;

public class SalarySlip extends SalaryComponents2{

	public static void main(String[] args) {
		SalaryComponents2 sal=new SalaryComponents2();
		sal.setComponents(4000, 6000, 8000);
		System.out.print("Total salary in slip: ");
		System.out.println(sal.getBasicPay()+sal.calculateHRA()-sal.calculatePF()-sal.getDeduction()+sal.getBonus());

	}

}
