package simple;

public class project4 {

	int empId;
	String empName;
	String department;
	float salary;
	
	//default constructor
	public project4() {
		empId=21;
		empName="Ammu";
		department="Resolution-Desk";
		salary=35000;
	}
	
	//parametrized constructor
	public project4(int empId,String empName,String department,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		project4 e= new project4();
		project4 e1= new project4(221, " Amrutha", "Training", 400000); 

		//calling default constructor
		e.display();
		//parametrized constructor
		e1.display();
		
		 
	
	}

	
}
