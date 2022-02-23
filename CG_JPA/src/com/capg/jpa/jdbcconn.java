package com.capg.jpa;
import java.sql.*;

public class jdbcconn {
	public static void main(String[] args) {
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres","root");
			System.out.println("Connected Successfully");
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from public.employee");
			while(rs.next()) {
				System.out.println("Employee No: "+rs.getInt(1));
				System.out.println("Employee Name: "+rs.getString(2));
			}
			if(c!=null) {
				rs.close();
				st.close();
				c.close();
			}
		}catch(Exception e) {
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened Database successfully");
	}
}


