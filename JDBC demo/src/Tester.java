import java.sql.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mixxxzdb","root","mihirsql");
//		Statement stmt = conn.createStatement();
//		ResultSet rset = stmt.executeQuery("select * from Laptop");
//		while(rset.next()) {
//			System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getDouble(3));
//		}
		
//		boolean status = stmt.execute("insert into laptop values(110,'NewLap',34000)");
//		if(!status) {
//			System.out.println("Row inserted successfully");
//		}
		
		
//		Taking user input:
		System.out.print("Enter lid: ");
		int lid = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter make: ");
		String make = sc.nextLine();
		
		System.out.print("Enter cost: ");
		double cost = sc.nextDouble();
		
		PreparedStatement pstmt = conn.prepareStatement("insert into Laptop values(?,?,?)");
		pstmt.setInt(1, lid);
		pstmt.setString(2, make);
		pstmt.setDouble(3, cost);
		
		boolean status = pstmt.execute();
		if(!status) {
			System.out.println("Data insertion successfully");
		}
		
		conn.close();

	}

}
