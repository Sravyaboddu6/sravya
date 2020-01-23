package pack;

public class studentDao {
	package com.javatpoint;  
	import org.springframework.jdbc.core.JdbcTemplate;  
	  
	public class EmployeeDao {  
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveStudent(student e){  
	    String query="insert into student values(  
	    '"+e.getSId()+"','"+e.getSName()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateEmployee(student e){  
	    String query="update student set   
	    name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(student e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	  
	}  
}
