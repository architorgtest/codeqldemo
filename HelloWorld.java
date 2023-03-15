import java.sql.DriverManager;
import java.sql.SQLException;
class HelloWorld {
    public static void main(String[] args)  throws SQLException{
        System.out.println("Hello, World!"); 
		 System.out.println("Hello, World!");
        String id = "admin"; // hard-coded credential
        String password = "password"; // hard-coded credential
       
	   getConn(id,"password");
		
    }
	
	public static void getConn(String id, String password) throws SQLException {
   
    DriverManager.getConnection(id, "password",password); // sensitive call
}
}
