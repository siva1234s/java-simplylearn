package com.mphasis;

  //Default constructor
class Emp{
int id;
String name;

void display() {
System.out.println(id+" "+name);
}
}

public class ConstructorExample {

	public static void main(String[] args) {

		Emp emp1=new Emp();
		Emp emp2=new Emp();

		emp1.display();
		emp2.display();
		
		Std std1=new Std(2,"Indian");
		
		std1.display();
		
		}
	}
	   
	           //parameterized constructor
	class Std{
		int id;
		String name;

		Std(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}

}
