package ro.catalin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import ro.catalin.model.Circle;



public class JDBCDaoImpl
{
	@Autowired
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate=new JdbcTemplate();
	
	public JdbcTemplate getJdbcTemplate()
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	public Circle getCircle(int circleID) 
	{

		Connection conn = null;

	//	String driver = "org.apache.derby.jdbc.ClientDriver";
		try
		{
		//	Class.forName(driver).newInstance();
		//	conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db");
			conn = dataSource.getConnection();

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM circle where id=?");
			ps.setInt(1, circleID);
			Circle circle=null;
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				circle=new Circle(circleID,rs.getString("name"));
			}
			rs.close();
			ps.close();
			return circle;
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
			
		}finally{
			try{
			conn.close();
			}
			catch(SQLException sq){
				throw new RuntimeException(sq);
			}
		}
	}
	public int getCircleCount(){
		String sql="SELECT COUNT(*) from Circle";
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForInt(sql);
		
	}

	public DataSource getDataSource()
	{
		return dataSource;
	}

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

}
