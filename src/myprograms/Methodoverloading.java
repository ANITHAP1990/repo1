package myprograms;

public class Methodoverloading {
	public void add()
	{
		int a=10,b=20,s;
		s=a+b;
		System.out.println("Sum ="+s);
	}
	public void add(int a,int b)	//by changing the parameters
	{
	
		int s=a+b;
		System.out.println("Sum ="+s);
	}
	public void add(int a,double b)		//by changing the type of parameters
	{
		double s;
		s=a+b;
		System.out.println("Sum ="+s);
	}
	public void add(double a,int b)			//by changing the order of parameters
	{
		double s;
		s=a+b;
		System.out.println("Sum ="+s);
	}
	
	
	public static void main(String[] args) {

		Methodoverloading o=new Methodoverloading();
		o.add();
		o.add(10,20);
		o.add(20,20.5);
		o.add(30.2,12);
		
	}

}