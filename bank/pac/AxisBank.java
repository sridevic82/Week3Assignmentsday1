package bank.pac;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankInfo bank=new BankInfo();
		AxisBank axis=new AxisBank();
		bank.fixed();
		bank.saving();
		axis.deposit();

	}

	
public void deposit()
{
	System.out.println("Deposit is 20,000");
}
}
