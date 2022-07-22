package simple;

public class project2 {

	
	public void methodPublic() {
		System.out.println("This is public method");
	}
	
	private void methodPrivate() {
		System.out.println("This is private method");
	}
	
	void methodDefault() {
		System.out.println("This is default method");
	}
	
	protected void methodProtected() {
		System.out.println("This is protected method");
	}
	
	//same class able to aceess all types of modifiers
	public static void main(String [] args) {
		
		project2 obj= new  project2();
		
		obj.methodDefault();
		obj.methodPrivate();
		obj.methodProtected();
		obj.methodPublic();
		
	
	}
}
