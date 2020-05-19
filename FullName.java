import java.io.*;
class FullName
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Enter sur name:");
		String sur = br.readLine();
		
		System.out.print("Enter middle name:");
		String mid = br.readLine();
		
		System.out.print("Enter last name:");
		String lst = br.readLine();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(sur);
		sb.append(lst);
		
		int n=sur.length();
		sb.insert(n,mid);
		
		System.out.println("Full nme is: "+ sb);
	}
}