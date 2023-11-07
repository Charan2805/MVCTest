import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validation {
	public static boolean validate(String username,String password) {
		boolean status = false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","tunga","sravan");
			PreparedStatement ps=con.prepareStatement("select * from adminlog where username=? and password=?");
		    ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;

}
}
