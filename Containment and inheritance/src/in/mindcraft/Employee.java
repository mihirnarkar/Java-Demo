package in.mindcraft;

public class Employee {

	private int empid;
	private String name;
	private Date dob;
	
	public Employee() {
		empid = 101;
		name ="Mihir";
		dob= new Date();
		
	}
	
	public Employee(int empid,String name,int dd,int mm,int yy) {
		this.empid = empid;
		this.name = name;
		this.dob = new Date(dd,mm,yy);
		
	}
	
	public void show() {
		System.out.println("Id: "+empid);
		System.out.println("Name: "+name);
		dob.showDate();
	}

}
