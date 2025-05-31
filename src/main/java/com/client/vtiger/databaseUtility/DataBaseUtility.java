package com.client.vtiger.databaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.client.vtiger.generic.fileUtility.FileUtility;
import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	// declare Connection globally as we will close this connection in another method
	
	Connection conn;
	Statement stat;
	
	// get connection with parameter....
	public void getDbConnection(String url, String username, String password) throws Throwable {
		
		//handle exception
		
		try {
		Driver driver=  new Driver();
		DriverManager.registerDriver(driver);
		conn= DriverManager.getConnection(url, username, password);
		stat=conn.createStatement();
		}
		catch (Exception e) {
			
		}
	}
	
	
		// get connection without parameter
	   //hardcode the db connection as the applicatio will be having only one db 
		
		public void getDbConnection() throws Throwable {

		try {
		Driver driver=  new Driver();
		DriverManager.registerDriver(driver);
		FileUtility fu=new FileUtility();
		String dbUrl = fu.getDataFromPropertiesFile("dbURL");
		String dbUsername = fu.getDataFromPropertiesFile("dbUSERNAME");
		String dbPassword = fu.getDataFromPropertiesFile("dbPASSWORD");
		conn= DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
				//("jdbc:mysql://localhost:3306/projects", "root", "root");
		stat=conn.createStatement();
		}
		catch (Exception e) {	
		}
	}

		// close connection
	public void closeDbConnection() throws Throwable {
	try {
	conn.close();
	}
	catch (Exception e) {
	}
}
	
		// execute non select query
	public int executeNonSelectQuery (String query) throws SQLException {
		
		int result = 0;
		
		try {
		Statement stat = conn.createStatement();
		result =stat.executeUpdate(query);
		}
		catch (Exception e){	
		}
		return result;
	}
		
		// execute select query
		public Resultset executeSelectQuery (String query) throws SQLException {
		
		Resultset result = null;
		
		try {
		Statement stat = conn.createStatement();
		
		result =(Resultset) stat.executeQuery(query);
		}
		catch (Exception e){
			
			
		}
		return result;
		
	}
}
