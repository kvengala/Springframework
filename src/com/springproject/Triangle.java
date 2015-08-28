package com.springproject;

public class Triangle {
	private String type;
	private int height;
	
	public String getType(){
		return this.type;
	}
	public int getheight(){
		return this.height;
	}
	public Triangle(String type, int height)
	{
		this.type = type;
		this.height = height;
	}
	public Triangle(String type)
	{
		this.type = type;
		
	}
	
	public Triangle( int height)
	{
		
		this.height = height;
	}
	
	public void draw (){
		System.out.println(getType()+" " +"Draw-triangle"+" "+getheight());
	}
}
