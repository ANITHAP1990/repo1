package myprograms;

class Rbi
{	
	int amt=7000;
	
	public void interest()
	{
		System.out.println("interest rate is 7%");
		
	}
}
class Sbi extends Rbi
{

	int amt=2000;
	
	@Override
	public void interest() 	//method overriding : Method signature should be same
	{
		System.out.println("interest rate is 4%");
		super.interest();		//super is used to invoke parent lass method (/constructor/variable)
		System.out.println("amount = "+amt);
		System.out.println("amount = "+super.amt);

	}
	
}
public class Methodoverriding {

	public static void main(String[] args) {
		Sbi ob=new Sbi();
		ob.interest();
	}

}