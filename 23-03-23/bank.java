class bank{

	public static void main(String af[])
	{
	
		atm a1=new atm();
		
		Thread t1=new Thread(()->{
			a1.withdraw(5000);
		});
		
		Thread t2=new Thread(()->{
			a1.deposit(10000);
		});
		t1.start();
		t2.start();
	
	}


}

class atm{
	int amt=10000;

	synchronized void withdraw(int money){
	
		System.out.println("will withdraw");
		if(this.amt<money){
			System.out.println("Less amount; waiting for deposit");
			try{wait();}catch(Exception e){System.out.println(e);}
		}
		
		this.amt-=money;
		System.out.println("withdraw done");
		
	}

	synchronized void deposit(int money){
	
	System.out.println("depositing");
	this.amt+=money;
	System.out.println("deposit done");
	notify();
	}


}