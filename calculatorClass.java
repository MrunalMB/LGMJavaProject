

class Calculator
{
	int num1;
	int num2;
	int result;
//	ArithOperation arithobj = new ArithOperation();
	
	public void add(int a, int b)
	{
		num1=a;
		num2=b;
		 arithobj.add();
		
	}
	
	public void sub(int a, int b) 
	{
		num1=a;
		num2=b;
		 arithobj.sub();
		
	}
	
	public void mul(int a,int b)
	{
	    num1=a;
	    num2=b;
	    arithobj.mul();
	}
	
	public void div(int a,int b)
	{
	    num1=a;
	    num2=b;
	    arithobj.div();
	}
	
	
	private class ArithOperation 
	{
		public void add()
		{
			result= num1+num2;
			d.display();
		}
		
		public void sub()
		{
			result= num1-num2;
			d.display();
		}
		
		public void mul()
		{
		    result=num1*num2;
		    d.display();
		}
		
		public void div()
		{
		    result=num1/num2;
		    d.display();
		}
		
		class Display
		{
			void display()
			{
				System.out.println("result is="+result);
			}
		}
		
		Display d = new Display();
		
	}
		ArithOperation arithobj = new ArithOperation();
}

public class Main {

	public static void main(String[] args)
 {
		
		Calculator cal= new Calculator();
		cal.add(7,3);
		cal.sub(7,3);
		cal.mul(7,3);
		cal.div(7,3);
		
		// TODO Auto-generated method stub

	}

}


