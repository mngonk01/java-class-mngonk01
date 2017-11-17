package exercise7;

/**
 *
 * @author mngonk01
 */
public class SalariedEmployee extends Employee {
	private double salary;
	
	public SalariedEmployee(String name, String ssn, double salary) {
		super(name, ssn);
		setSalary(salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetPay() {
		netPay = salary;
		return netPay;
	}
	public void printWeeklyCheck() {
		super.printWeeklyCheck();
		System.out.printf("Weekly earnings: $%.2f\n", getNetPay()/52);
	}
	public static void main(String[] args) {
		SalariedEmployee e = new SalariedEmployee("Mrico Ginindza", "111-22-3333", 52000);
		e.printWeeklyCheck();
	}
}
