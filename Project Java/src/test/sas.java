package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sas {
	public static void main(String[] args) {
		Connection conn = null;
	
		try{
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Qli BanSach;IntegratedSecurity=true");
	        String qr="SELECT * FROM base";
	        Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery(qr);
	        rs.next();
	        System.out.println(rs.getString(1));
	       

	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	           
	        }
	}
}
