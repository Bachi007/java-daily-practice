class library
{
	public static void main(String ag[])
	{
		book b1=new book();
		Thread t1=new Thread(b1);
		t1.start();
	}

}

class book implements Runnable{

	public void run(){
	
		System.out.println("Im from Thread Class");
	
	}

}