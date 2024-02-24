class Account
{
	private String depositorName;
	private String accountNumber;
	private String accountType;
	private double balance;

	public Account(String depositorName,String accountNumber,String accountType,double initialBalance)
	{
		this.depositorName=depositorName;
		this.accountNumber=accountNumber;
		this.accountType=accountType;
		this.balance=initialBalance;
	}
	public void deposit(double amount)
	{
		if(amount<=0)
		{
			System.out.println("Invalid deposit amount.");
		}
		else
		{
			balance+=amount;
			System.out.println("Deposit of amount +"Rp.Successful");
		}
	}
	public void displayAccountInfo()
	{
		System.out.println("Depositor Name:"+depositorName);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Type:"+accountType);
		System.out.println("Balance :"+balance+"Rp.");
	}
}
class P8
{
	public static void main(String [] args)
	{
		Account account=new Account("Asta","220130318112","Savings",27000);
		account.deposite(15000);
		account.displayAccountInfo();
	}
} 