import java.util.Scanner;
class atm 
{
private int net_balance;
private int remain;
int withdraw;

atm(int x)
{
net_balance=x;


}

public void setbalance(int withdra)
	{
	if(withdra>0)
		{
	withdraw=withdra;
remain=net_balance-withdra;

		}
		else{
			
        System.out.println("not valid amount");
		
		
		}
	}
		
    
	}


public String getbalance()
	{
     return ("Total amount is: "+net_balance+"\nwithdraw amount is: "+withdraw+"\nremaining amount is"+remain);
	}
}
class bank
{
	public static void main(String[] args) 
	{
		System.out.println("Enter withdraw amount");
		atm a=new atm(20000);
		
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		a.setbalance(y);
        String p=a.getbalance();
		System.out.println(p);

		
	}
}
