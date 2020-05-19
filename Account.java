class AccountDetails
{
	String accNo;
	String accName;
	String accType;
	
	public void setAccDetails(String accNo1, String accName1, String accType1)
	{
		accNo = accNo1;
		accName = accName1;
		accType = accType1;
	}
	
	public void getAccDetails()
	{
		System.out.println("Account Details:");
		System.out.println("----------------");
		System.out.println("Account Id:"+accNo);
		System.out.println("Account Name:"+accName);
		System.out.println("Account Type:"+accType);
	}
}
	
public class Account 
{	
	public static void main(String args[])
	{
		AccountDetails acd = new AccountDetails();
		
		acd.setAccDetails("BNK123","Ramya","Savings");
		acd.getAccDetails();
	}
}
