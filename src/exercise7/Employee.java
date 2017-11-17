package exercise7;

/**
 *
 * @author mngonk01
 */
public class Employee {
	protected String name;
	protected String ssn = "000-00-0000";
	protected double netPay;
	
	public Employee(String name, String ssn) {
		setName(name);
		setSSN(ssn);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSSN() {
		return ssn;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	protected double getNetPay() {
		return netPay;
	}
	protected void printWeeklyCheck() {
		System.out.println("Name: " + name);
		System.out.println("SSN: " + ssn);
	}
}
