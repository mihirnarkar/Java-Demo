package example12;

interface Printable{
	public void printDetails();
}

class CktPlayer implements Printable {
	private String name;
	private int runs;
	
	public CktPlayer(String name,int runs) {
		this.name = name;
		this.runs = runs;
	}
	
	public void printDetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Runs: "+this.runs);
	}
}

class FtPlayer implements Printable {
	 private String name;
	 private int goals;
	 
	 public FtPlayer(String name,int goals) {
		 this.name = name;
		 this.goals = goals;
	 }
	 
	 public void printDetails() {
		 System.out.println("Name: "+this.name);
		 System.out.println("Runs: "+this.goals);
	 }
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CktPlayer c = new CktPlayer("Sky", 1200);
		FtPlayer f = new FtPlayer("Mbappe", 100);
		c.printDetails();
		f.printDetails();

	}

}
