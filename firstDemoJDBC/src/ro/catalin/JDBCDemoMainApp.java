package ro.catalin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ro.catalin.dao.JDBCDaoImpl;
import ro.catalin.model.Circle;

public class JDBCDemoMainApp
{
	public static void main(String[] args){
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		JDBCDaoImpl dao=ctx.getBean("x",JDBCDaoImpl.class);
		
		Circle circle=dao.getCircle(1);
		System.out.println(circle.getName());
		System.out.println(dao.getCircleCount());
	}
}
