import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class Connectmy {
	public static void main(String args[])throws Exception {
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sathvik");
  Statement st=conn.createStatement();
  String query="create table dummy(col1 int)";
  int result=st.executeUpdate(query);
  System.out.println("Success");
  conn.close();
	}
}
