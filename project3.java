package simple;

public class project3 {

	
	//void method do not have any return type
	 public void methodDisplay() {
		System.out.println("Display method called");
	 }
	 
	 public int methodNumber() {
		 
		 int a=5;
		 return a;
	 }
	
	 public static void main(String[] args) {
		 
		 project3 obj= new project3();
		 obj.methodDisplay();
		 
		 int result=obj.methodNumber();
		 
		 System.out.println(result);
		
	}
}