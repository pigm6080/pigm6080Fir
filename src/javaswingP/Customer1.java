package javaswingP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;




public class Customer1 {
	public static void main(String[] args) {
		createCustomer("asdasd", "750", "1", "750");
		ArrayList<String> list = getCustomers();
		for (String item : list) {
			System.out.println(item);
		}
		
	}
	public static void createCustomer(String name, String pay,String cnt,String money) {
		try {
			Connection con = getconnext();
			PreparedStatement insert = con.prepareStatement(""
					+"INSERT INTO japangi(name, pay,  cnt, money) "
					+"VALUE "
					+"('"+name+"','"+pay+"','"+cnt+"','"+money+"')");
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
	public static void DelTable() {
		try {
			Connection con = getconnext();
			PreparedStatement del = con.prepareStatement("DELETE FROM japangi;");
			del.execute();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static ArrayList<String> getCustomers(){
		try {
			Connection con = getconnext();
			PreparedStatement statemont = con.prepareStatement(""
					+ "select name, pay, cnt From japangi"); 
			ResultSet results  = statemont.executeQuery();
			ArrayList<String> list = new ArrayList<String>();
			while(results.next()) {
				
				list.add("Name : " + results.getString("name")+ "  Phone : "+ 
						results.getString("pay") +"  gender"+ results.getString("cnt"));
				  
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
					+ "select name, pay, cnt,money From japangi"); 
			ResultSet results  = statemont.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[]{
					results.getString("name"),
					results.getString("pay"),
					results.getString("cnt"),
					results.getString("money"),
				});
				
			}
			System.out.println("The daa has been fatched");
			String[][] arr = new String[list.size()][4];
			
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
					+ "japangi(id int NOT NULL AUTO_INCREMENT,"
					+ "name varChar(255),"	
					+ "pay varChar(255),"
					+ "cnt varChar(255),"
					+ "money varChar(255),"
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
