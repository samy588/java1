import java.io.*;
public class timedatectl 
{
public static void main(String args[])
{
	String command="lscpu";
	try
	{
		Process process = Runtime.getRuntime().exec(command);
		BufferedReader reader= new BufferedReader(
				new InputStreamReader(process.getInputStream()));
	
	
		System.out.println(line);
	
		reader.close();
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
}
