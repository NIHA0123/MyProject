package MyPack1;

public class MyCalci {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		MyCalci myCalci = new MyCalci();
		System.out.println("Sum:"+myCalci.sum(10,20));
	}

}
