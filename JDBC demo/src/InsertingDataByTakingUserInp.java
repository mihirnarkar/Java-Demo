import java.util.Scanner;
import java.sql.*;

public class InsertingDataByTakingUserInp {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mixxxzdb","root","mihirsql");
		Statement stmt = con.createStatement();
		
//		Taking user input:
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter role: ");
		String role = sc.nextLine();
		
//		Creating a parameterized insert query
		String insertQuery = "INSERT INTO Employee (Id, Name, Role) VALUES (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertQuery);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, role);
        
// 		Executing the parameterized INSERT query
        int rowsAffected = pstmt.executeUpdate();
        
        if(rowsAffected>0) {
        	System.out.println("Data added successfully");
        }else {
        	System.out.println("Failed to insert");
        }
        System.out.println();
        System.out.println("Displaying all records: ");
        System.out.println();
        
        ResultSet rset = stmt.executeQuery("select * from Employee");
        int i =1;
        while(rset.next()) {
        	System.out.println(i+") "+rset.getInt(1)+" "+rset.getString(2)+" "+rset.getString(3));
        	i++;
        }
        

	}

}
