package project1;

public class project7 {

public void dispaly(int a) {
	
	if(a==5)	     // when a=5 then only use inner class
	{
		class Inner{
			
			int a=10;
			
			void print() 
			{
				System.out.println("Method of inner class");
				
			}
			
		}
		
		Inner ob= new Inner();
		ob.print();
	}
	else 
		System.out.println("Anonymous Inner class");
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		project7 outer= new project7();
		outer.dispaly(6);
		
	}

}

