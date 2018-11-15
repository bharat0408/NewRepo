package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.model.Login;
import com.model.Registration;
import com.model.Registration;
public class Jdbc {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public Connection myConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Newuser123");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	public int saveData(List<Registration> lst)
	{
		System.out.println("dbsave1");
		int i=0;
		//Account a=lst.get(0);
		Registration a=null;
		con=myConnection();
		try
		{
			Iterator<Registration> itr=lst.iterator();
			System.out.println("dbsave2");
			while(itr.hasNext())
			{
				System.out.println("dbsave3");
				a=itr.next();
				ps=con.prepareStatement("insert into Registration values(?,?,?,?,?)");
				ps.setString(1, a.getUno());
				ps.setString(2,a.getName());
				ps.setString(3,a.getEmail());
				ps.setString(4,a.getPass());
				ps.setDouble(5, a.getBalance());
				i = ps.executeUpdate();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return i;
	}
	public List<Registration> displayAllData()
	{
		List<Registration> lst=new LinkedList<Registration>();
		con=myConnection();
		try
		{
		Statement s=
					con.createStatement
					(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			rs=s.executeQuery("select * from Registration");
			while(rs.next())
			{
				Registration a=new Registration();
				a.setUno(rs.getString(1));
				a.setName(rs.getString(2));
				a.setEmail(rs.getString(3));
				a.setPass(rs.getString(4));
				a.setBalance(rs.getDouble(5));
				lst.add(a);
				System.out.println("cnt");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return lst;
	}

public int deposit(int a, int uno) {
	
	int b=0;
	try {
		myConnection();
		List<Registration> lst=displayAllData();
		for(Registration r:lst)
		{
				ps = con.prepareStatement("update Registration set balance=? where uno=?");
				ps.setDouble(1, r.getBalance()+a);
				ps.setInt(2, uno);
				b = ps.executeUpdate();	
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return b;
	
}
	
public boolean validateUser(Login l)
	{
		myConnection();
		List<Registration> lst=displayAllData();
		boolean b=false;
		for(Registration r:lst)
		{
			if(r.getUno()==l.getUno())
			{
				if(r.getPass().equals(l.getPass()))
				{
					b=true;
					break;
				}
			}
		}
		return b;
	}
}

