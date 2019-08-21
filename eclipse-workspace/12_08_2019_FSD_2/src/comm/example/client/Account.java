package comm.example.client;

public class Account {
	private String account_name;
	private int Amount;
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "Account [account_name=" + account_name + ", Amount=" + Amount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Amount;
		result = prime * result + ((account_name == null) ? 0 : account_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Amount != other.Amount)
			return false;
		if (account_name == null) {
			if (other.account_name != null)
				return false;
		} else if (!account_name.equals(other.account_name))
			return false;
		return true;
	}
	@Override
	public boolean equals(Object obj)
	{
		Account acc= (Account)obj;
		if((this.account_name==acc.account_name)&&(this.Amount==acc.Amount))
			return true;
		else 
			return false;
	}
	

}
