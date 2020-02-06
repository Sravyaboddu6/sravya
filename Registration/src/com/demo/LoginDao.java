package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import com.demo.model.LoginPojo;

public class LoginDao {

public LoginPojo validateLogin(LoginPojo loginpojo) {
LoginPojo result;

try {
//String username = null;
//String password = null;
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost/sravya_db", "root", "");
PreparedStatement ps = c.prepareStatement("select * from login ");

//ps.setString(1, username);

// ps.setString(2, password);

ResultSet rs = ps.executeQuery();

while (rs.next()) {

if (loginpojo.getUserName().equals(rs.getString(1)) && loginpojo.getPassword().equals(rs.getString(2)))
{
loginpojo.setRole(rs.getString(3));

break;
}
}

c.close();
} catch (Exception e) {
System.out.println(e);
}
return loginpojo;
}
}