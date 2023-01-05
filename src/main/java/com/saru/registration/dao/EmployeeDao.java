package com.saru.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.saru.registration.model.Employee;

public class EmployeeDao {

	public int registerEmployee(Employee employee)throws ClassNotFoundException{
	String INSERT_USERS_SQL="INSERT INTO employee"+"(id,first_name,last_name,username,password,address,contact) VALUES"+"(?,?,?,?,?,?,?);";
	
	int result=0;
	
//	register the driver
	Class.forName("com.mysql.jdbc.Driver");
	
//	establish the connection to the driver at a given database  url
	try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false", "root", "spmysql");
	
	PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL)){
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setString(4, employee.getUsername());
			preparedStatement.setString(5, employee.getPassword());
			preparedStatement.setString(6, employee.getAddress());
			preparedStatement.setString(7, employee.getContact());
			
			System.out.println(preparedStatement);
			result=preparedStatement.executeUpdate();
			System.out.println("result="+result);
	}catch(SQLException e) {
e.printStackTrace();
}
return result;

	
	
	
	}
}
