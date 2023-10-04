import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Ass24 throws SQLException{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mixxxzdb","root","mihirsql");

	}

}
