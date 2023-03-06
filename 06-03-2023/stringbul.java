class stringbul{

	public static void main(String args[])

	{

		StringBuffer sb=new StringBuffer("James");

		sb.append(" Gosling");

		System.out.println(sb);

		System.out.println("after inserting");

		sb.insert(5,"bhaskar");

		//Jbhaskarames Gosling
				System.out.println(sb);
	}


}