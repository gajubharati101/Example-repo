class Test
{
public static void main(String[]args){
	Test t=new Test();
	t.show(15);
	t.show();
}

	void show()
	{
		System.out.println("1");	
	}

	void show(int a)
	{
		System.out.println("2");	
	}
}
