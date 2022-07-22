package simple;
import java.util.regex.*;
public class project_11 extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	 		project_11 mt = new  project_11();
	  		mt.start();
	 	}
	}




