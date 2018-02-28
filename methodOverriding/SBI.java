package methodOverriding;

public class SBI extends Bank {
	double roi() {
		double r=7.1;
		System.out.println(r);
		return r;
	}
	void msg() {
		System.out.println("thank you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		bank.roi();
		bank.display();
		SBI sbi=new SBI();
		sbi.roi();
		sbi.display();
		sbi.msg();
		

	}

}
