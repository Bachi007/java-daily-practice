class movr extends display
{

	public static void main(String bs[])
	{
		display mv=new movr();
		mv.printDetails();
		mv.announce();
	}

	@Override
	public void printDetails()
	{
		super.printDetails();
		System.out.println("this is movr class");
	}

	public void announce()
	{
		System.out.println("Announcement of data bindings");
	}


}
class display
{

	public void printDetails()
	{
		System.out.println("this is display class");

	}
	
}