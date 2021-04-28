package q006;

import java.io.IOException;


public class Main 
{
	public static void main(String args[])  throws IOException, InterruptedException
	{
	
	      Test test=new Test();
	      Test test1=new Test();
		  test.createChromeDriver();
		  Test.test();
		  test1.createFireDriver();
		  Test.test();
	}
}