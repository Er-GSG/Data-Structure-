package com.DS;

public class Human {

	String name;
	int age;
	String eyeColor;
	public Human(String name, int age, String eyeColor) {
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
	}
	public void humnaLook()
	{
		System.out.println("Human Name is "+ name);
		System.out.println("Human age is "+ age);
		System.out.println("Human eyeColor is "+ eyeColor);
	}
}
 class Earth
{
 public static void main(String args[])
 {
	 Human guru= new Human("Guru", 10, "black");
	 guru.humnaLook();
	 Human singh=new Human("Gap",20,"brown");
     singh.humnaLook();
 }
}

