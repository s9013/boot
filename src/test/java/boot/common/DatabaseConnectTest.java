package boot.common;

import java.sql.Connection;
import java.sql.DriverManager;

/** 
* @ClassName: 		DatabaseConnectorTest 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:27:07  
*/
public class DatabaseConnectTest {

	public static final String name = "com.mysql.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost/wind";
	public static final String user = "root";
	public static final String password = "123456";

	public static void main(String[] args) {
		try {
			Class.forName(name);
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

