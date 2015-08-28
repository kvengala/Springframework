package com.springproject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String args[])
	{
		try{
		//triangle.draw();
		//BeanFactory beanfactory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext 	context = new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangle =(Triangle)context.getBean("Triangle");
		triangle.draw();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
