package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      PreparedStatement st;
	      String ab;
	      String email;
	      String num;
	      String query;
		try {
			Connection conn = DriverManager.getConnection(
			        "jdbc:postgresql://127.0.0.1:5432/contact", "postgres", "1234");
			System.out.println("success connected to contact");

	        ResultSet rs;
	         String searchQuery = "SELECT * FROM contactdetails ";
	            st = conn.prepareStatement(searchQuery);
	            rs = st.executeQuery();
	            while(rs.next())
	            {	                 
	               ab =rs.getString("name");
	               System.out.println(ab);
	               email =rs.getString("email");
	               System.out.println(email);
	               num =rs.getString("phnumber");
	               System.out.println(num);
	                               
	            }
	             query = "INSERT INTO contactdetails(name, email,phnumber) VALUES (?,?,944417447)";
	             PreparedStatement statement = conn.prepareStatement(query);
	             statement.setString(1, "bill");
	             statement.setString(2, "bill.gates@microsoft.com");
	             statement.executeUpdate();
	             
			conn.close();

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}
		
	}
