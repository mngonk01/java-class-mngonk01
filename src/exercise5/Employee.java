package exercise5;

/**
 * Class Employee
 * Task 3: Create a class Employee with the following private data members: String firstName, String lastName, double salary, boolean fullTime. The string representation of an object of this class depends on the value of the isFullTime member. If an employee is full time, their salary is reported as annual, otherwise it's hourly.
 * @author mngonk01
 */
public class Employee {
    private String FirstName;
    private String LastName;
    private double Salary;
    private boolean isFullTime;
    
    public Employee(String FirstName, String LastName, double Salary, boolean isFullTime){
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.Salary = Salary;
            this.isFullTime = isFullTime;
}

public String getFirstName(){
    return FirstName;
}
public String getLastName(){
    return LastName;
}
public double getSalary(){
    return Salary;
}
public boolean isIsFullTime() {
        return isFullTime;
}
@Override
public String toString(){
    String s = "Name: " + FirstName + " " + LastName + "\n";
    if (isFullTime) {
        s += "Annual";
    } else {
        s += "Hourly";
    }
    s += " salary: $" + Salary;
    return s;
}
}
