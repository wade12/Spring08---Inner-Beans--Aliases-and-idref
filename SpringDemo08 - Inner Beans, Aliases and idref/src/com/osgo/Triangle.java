package com.osgo;

public class Triangle
{
	// private String type;
	// private int height;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	

	/*public Triangle(String type)
	{
		this.type = type;
	} // end 1-argument String constructor
	
	public Triangle(int height)
	{
		this.height = height;
	} // end 1-argument height constructor
	
	public Triangle(String type, int height)
	{
		this.type = type;
		this.height = height;
	} // end 2-argument constructor
	
	public String getType()
	{
		return type;
	} // end method getType

	public void setType(String type)
	{
		this.type = type;
	} // end method setType
	
	
	public int getHeight()
	{
		return height;
	} // end method getHeight
*/	

	public Point getPointA()
	{
		return pointA;
	} // end method getPointA


	public void setPointA(Point pointA)
	{
		this.pointA = pointA;
	} // end method setPointA


	public Point getPointB()
	{
		return pointB;
	} // end method getPointB


	public void setPointB(Point pointB)
	{
		this.pointB = pointB;
	} // end method setPointB


	public Point getPointC()
	{
		return pointC;
	} // end method getPointC


	public void setPointC(Point pointC)
	{
		this.pointC = pointC;
	} // end method setPointC
	
	public void draw()
	{
		// System.out.println(getType() + " Triangle drawn of height " + getHeight());
		System.out.println("Point A = (" + getPointA().getX() + "," + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + "," + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + "," + getPointC().getY() + ")");
		
	} // end method draw()
	
} // end Class Triangle
