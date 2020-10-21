import java.io.*;
public class timedatectl 
{
public static void main(String args[])
{
	String command="lscpu";
	try
	{
		String line=sc.nextLine();
		Process process = Runtime.getRuntime().exec(command);
		BufferedReader reader= new BufferedReader(
				new InputStreamReader(process.getInputStream()));
	
	
		System.out.println(line);
		//inputting a line is necessary
	
		reader.close();
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
		System.out.println(e);
	}
	
}
}
