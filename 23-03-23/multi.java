//synchornized method in muti threading


public class multi {

	public static void main(String args[])
	{
		counter c=new counter();
		Thread t1=new Thread(
		()->{
			for(int a=0;a<1000;a++){
				c.incr();
			}
		}
		);
		Thread t2=new Thread(()->{
			for(int a=0;a<1000;a++){
				c.incr();
			}
		});
		t1.start();
		t2.start();
		try{t1.join();t2.join();}catch(Exception e){System.out.println(e);}
		System.out.println(c.i);
	
	}

}

class counter {

	int i=0;
	
	public synchronized void incr(){
		i++;
	}

}
