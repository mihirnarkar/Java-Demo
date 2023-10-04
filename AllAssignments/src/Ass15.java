import java.util.*;

class Employee{
	private int empId;
	private String empName;
	private long empSal;
	
	public Employee() {
		
	}
	
	public Employee(int empId,String empName,long empSal) {
		this.empId = empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpSal() {
		return empSal;
	}

	public void setEmpSal(long empSal) {
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}
	
	public void updateSalary(long sal) {
		this.empSal = sal;
	}
	
	
	public void display() {
		System.out.println("Name: "+this.empName);
		System.out.println("Id: "+this.empId);
		System.out.println("Salary: "+this.empSal);
	}
}


public class Ass15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		while(true) {
			System.out.println("\nMenu:");
            System.out.println("1. Insert Employee Record");
            System.out.println("2. Update Employee Salary");
            System.out.println("3. Display All Employee Records");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice) {
            case 1:
        		System.out.print("Enter employee id: ");
        		int id = sc.nextInt();
        		sc.nextLine();
        		System.out.print("Enter employee name: ");
        		String name = sc.nextLine();
        		System.out.println("Enter employee salary: ");
        		long sal = sc.nextLong();
        		
            	Employee emp = new Employee(id,name,sal);
            	
            	employeeList.add(emp);
            	System.out.println("Employee record inserted");
            	break;
             
            case 2:
            	System.out.print("Enter employee id to update salary: ");
            	int userEmpid = sc.nextInt();
            	boolean found = false;
            	for(Employee empNew : employeeList) {
            		if(empNew.getEmpId() == userEmpid) {
            			System.out.println("Enter salary to add: ");
            			long userSal = sc.nextLong();
            			empNew.updateSalary(userSal);
            			System.out.println("salary updated..");
            			found = true;
            			break;
            		}
            	}
            	if(found == false) {
            		System.out.println("Employee not found");
            	}
            	break;
            	
            case 3:
            	System.out.println("Displaying all employees record: ");
            	for(Employee empNew : employeeList) {
            		empNew.display();
            		System.out.println("--------------------");
            	}
            	break;
            	
            case 4:
            	System.out.println("Done.");
            	System.exit(0);
            
            }
            
		}
		
	}

}
