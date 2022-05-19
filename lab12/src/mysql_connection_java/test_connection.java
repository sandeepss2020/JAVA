package mysql_connection_java;
import java.util.Scanner;
import java.sql.*;
public class test_connection
{
	
	// Insert into Table
			static void insert_data(Connection con, Scanner sc) throws SQLException
			{	
				while(true)
				{
					System.out.println("Do you want to continue ? 1. Yes 2. No");
					int res = sc.nextInt();
					if(res==1)
					{
						try {
						System.out.println("Enter Firstname : ");
				        String fn = sc.next();
				        System.out.println("Enter Lastname : ");
				        String ln = sc.next();
				        System.out.println("Enter Roll : ");
				        int rl = sc.nextInt();
				        
				        String query = "insert into Student (firstname, lastname, roll)" + " values (?, ?, ?)";
				    	PreparedStatement preparedStmt = con.prepareStatement(query);
				    	preparedStmt.setString(1, fn);
				    	preparedStmt.setString(2, ln);
				    	preparedStmt.setInt(3, rl);   // for float => setFloat
				    	preparedStmt.executeUpdate();
				        System.out.println("Data Inserted !!");
					}
						catch (Exception e) {
							System.out.println(e);
							
						}
						}
					else
					{
						break;
					}
				}
			}
			
			
			// Update Data
			static void update_data(Connection con, Scanner sc) throws SQLException
			{
				System.out.println("Enter Firstname : ");
		        String fn = sc.next();
		        System.out.println("Enter Lastname : ");
		        String ln = sc.next();
		        System.out.println("Enter Roll : ");
		        int rl = sc.nextInt();
		        
		        String query = "update Student set firstname = ?, lastname = ? where roll = ?";
		        PreparedStatement preparedStmt = con.prepareStatement(query);
		        preparedStmt.setString(1, fn);
		        preparedStmt.setString(2, ln);
		        preparedStmt.setInt(3, rl);
		        preparedStmt.executeUpdate();
		        
		        System.out.println("Update done");
			}

			
			// Delete Data
			static void delete_data(Connection con, Scanner sc) throws SQLException
			{
				System.out.println("Enter Roll : ");
		        int rl = sc.nextInt();
		        
		        String query = "delete from student where roll = ?";
		        PreparedStatement preparedStmt = con.prepareStatement(query);
		        preparedStmt.setInt(1, rl);
		        preparedStmt.executeUpdate();
		        
		        System.out.println("Delete done");
			}
			
			
			// Show Data from Database
			public static void show_all_data(Connection con) throws SQLException
			{
		        Statement stmt = con.createStatement();
		        ResultSet rs = stmt.executeQuery("select * from student");
		        while(rs.next())
		        {
		        	System.out.println( rs.getString(1) + " " + rs.getString(2) + " " +rs.getInt(3) );
//		        	System.out.println( rs.getString(1) + " " + rs.getString(2)+"  done");
		        }
		        con.close();
			}
	public static void main(String[] args) throws SQLException
	{


		
		Scanner sc = new Scanner(System.in);
		
		String JdbcURL = "jdbc:mysql://localhost:3306/java_icss?" + "autoReconnect=true&useSSL=false";
		String Username = "root";
		String password = "password";
		Connection con = null;
		
		// connection creation
		con = DriverManager.getConnection(JdbcURL, Username, password);
        System.out.println("Your JDBC URL is as follows:" + JdbcURL);
        insert_data(con, sc);
//        update_data(con, sc);
//        delete_data(con, sc);
        show_all_data(con);
	}
	
}
