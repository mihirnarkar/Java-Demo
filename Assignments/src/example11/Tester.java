package example11;

class Employee{
	private double empId;
	private String empName;
	private double empSal;
	
	public Employee(double empId,String empName,double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public double getEmpSal() {
		return this.empSal;
	}
	
	public void displayDetails() {
		System.out.println("Id: "+this.empId);
		System.out.println("Name: "+this.empName);
		System.out.println("Salary: "+this.empSal);
	}
	
	public double calculateGrossSalary() {
		return empSal;
	}
	
	public double getNetSalary() {
		double pf = 0.125 * empSal;
		return calculateGrossSalary() - pf;
	}
	
	
}

class Manager extends Employee{
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	public Manager(double empId,String empName,double empSal,double petrolAllowance,double foodAllowance,double otherAllowance) {
		super(empId,empName,empSal);
		this.petrolAllowance = petrolAllowance;
		this.foodAllowance = foodAllowance;
		this.otherAllowance = otherAllowance;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
        System.out.println("Petrol Allowance: " + this.petrolAllowance);
        System.out.println("Food allowance: " + this.foodAllowance);
        System.out.println("Other allowance: " + this.otherAllowance);
	}
	
	@Override
	public double calculateGrossSalary() {
		double actualPetrolAllowance = this.petrolAllowance / 100;
		double actualFoodAllowance = this.foodAllowance / 100;
		double actualOtherAllowance = this.otherAllowance / 100;
		return super.calculateGrossSalary() + (actualPetrolAllowance * getEmpSal()) + (actualFoodAllowance * getEmpSal()) +(actualOtherAllowance * getEmpSal());
	}
	
	
	
}

class MarketingExecutive extends Employee {
	private double kilometerTravel;
	private double tourAllowance;
	private double phoneAllowance;
	
	public MarketingExecutive(int empId,String empName,int empSal,int kilometerTravel,int tourAllowance,int phoneAllowance) {
		super(empId,empName,empSal);
		this.kilometerTravel = kilometerTravel;
		this.tourAllowance = tourAllowance;
		this.phoneAllowance = phoneAllowance;
	}
	
	public void displayDetails() {
		super.displayDetails();
//		System.out.println("Kilometers travel: "+this.kilometerTravel);
//		System.out.println("Tour allowance: "+this.tourAllowance);
//		System.out.println("Phone allowance: "+this.phoneAllowance);
		double totalAllowance = (this.kilometerTravel * 5) + 2000;
		double deduction = totalAllowance * 0.1;
		double netSalary = getEmpSal() + totalAllowance - deduction;
		
		
		System.out.println("Total Allowance: " + totalAllowance);
        System.out.println("Deductions: " + deduction);
        System.out.println("Net Salary: " + netSalary);
		
	}
	
	
}

public class Tester {
	
	static void printObjects(Employee e) {
		e.displayDetails();
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "satish", 12000);
		Manager m1 = new Manager(2, "Mixxz", 20000, 8, 12, 4);
		
//		e1.displayDetails();
		printObjects(e1);
		System.out.println("Gross salary: "+e1.calculateGrossSalary());
		
		System.out.println("Net salary: "+e1.getNetSalary());
		
		System.out.println("------------------------");
		
//		m1.displayDetails();
		printObjects(m1);
		System.out.println("Gross salary: "+m1.calculateGrossSalary());
		System.out.println("Net salary: "+m1.getNetSalary());
		
	}

}
