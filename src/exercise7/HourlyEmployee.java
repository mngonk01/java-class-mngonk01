package exercise7;

/**
 *
 * @author mngonk01
 */
public class HourlyEmployee extends Employee {
	private double wageRate;
	private double hours;
	
	public HourlyEmployee(String name, String ssn, double wageRate, double hours) {
		super(name, ssn);
		setWageRate(wageRate);
		setHours(hours);
	}
	public double getWageRate() {
		return wageRate;
	}
	public void setWageRate(double wageRate) {
		this.wageRate = wageRate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getNetPay() {
		netPay = wageRate*hours;
		return netPay;
	}
	public void printWeeklyCheck() {
		super.printWeeklyCheck();
		System.out.printf("Weekly earnings: $%.2f\n", getNetPay());
	}
	public static void main(String[] args) {
		HourlyEmployee e = new HourlyEmployee("Nkosi Dlamini", "123-45-6789", 60, 40);
		e.printWeeklyCheck();
	}
}