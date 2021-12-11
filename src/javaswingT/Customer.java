package javaswingT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;




public class Customer {
	public static void main(String[] args) {
		createCustomer("sdfsdf", "123123123", "12", "2342123","Male");
		ArrayList<String> list = getCustomers();
		for (String item : list) {
			System.out.println(item);
		}
		
	}
	public static void createCustomer(String name, String phone,String age,String gender,String note) {
		try {
			Connection con = getconnext();
			PreparedStatement insert = con.prepareStatement(""
					+"INSERT INTO customer(name, phone,  age, note, gender) "
					+"VALUE "
					+"('"+name+"','"+phone+"','"+age+"','"+note+"','"+gender+"')");
			insert.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	public static void alterTable() {
		try {
			Connection con = getconnext();
			PreparedStatement alter = con.prepareStatement("ALTER TABLE customer ADD COLUMN gender varChar(255);");
			alter.execute();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static ArrayList<String> getCustomers(){
		try {
			Connection con = getconnext();
			PreparedStatement statemont = con.prepareStatement(""
					+ "select name, phone, gender From customer"); 
			ResultSet results  = statemont.executeQuery();
			ArrayList<String> list = new ArrayList<String>();
			while(results.next()) {
				
				list.add("Name : " + results.getString("name")+ "  Phone : "+ 
						results.getString("Phone") +"  gender"+ results.getString("gender"));
				  
			}
			System.out.println("The data has benen fached");
			return list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		
		}
	}
	public static String[][] getCustomersTable(){
		try {
			Connection con = getconnext();
			PreparedStatement statemont = con.prepareStatement(""
					+ "select name, phone, gender,age,note From customer"); 
			ResultSet results  = statemont.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[]{
					results.getString("name"),
					results.getString("phone"),
					results.getString("gender"),
					results.getString("age"),
					results.getString("note"),
				});
				
			}
			System.out.println("The daa has been fatched");
			String[][] arr = new String[list.size()][5];
			
			return list.toArray(arr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
			
		}
	}
	
	public static void createTable() {
		try {
			Connection con = getconnext();
			PreparedStatement create = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS "
					+ "customer(id int NOT NULL AUTO_INCREMENT,"
					+ "name varChar(255),"	
					+ "phone varChar(255),"
					+ "age varChar(255),"
					+ "note varChar(255),"
					+ "PRIMARY KEY(id))");
			create.execute();
			System.out.println("Good");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		
		}finally {
		}
	}
	
	public static Connection getconnext() {
		try {
			String diver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5458013";
			String user = "sql5458013";
			String pass = "9C5gDnkyZb";
			Class.forName(diver);
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("The connection Successful");
			return con;
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
