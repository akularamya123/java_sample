//Accept values from keyword 

import java.io.*;
class accept_from_cmd
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int a = Integer.parseInt(br.readLine());
		System.out.println("You entered:"+a);
		
	}
}