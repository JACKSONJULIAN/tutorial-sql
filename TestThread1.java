package Tread;

 class TwoStrings 
{
	 synchronized static void print(String str1, String str2)
{
	System.out.println(str1);
	try
	{
		Thread.sleep(500);
	}
	catch(Exception ie)
	{
	}
	System.out.println(str2);
}
}
class PrintStringsThread implements Runnable
{
	Thread td;
	String str1,str2;
	 PrintStringsThread(String str1, String str2)
	 {
		 this.str1=str1;
		 this.str2=str2;
		 td=new Thread(this);
		 td.start();
	}
	 public void run()
	 {
		 TwoStrings.print(str1, str2);
	 }
	 }
class TestThread1
{
	public static void main(String[] args) {
		new PrintStringsThread("Hello","there");
		new PrintStringsThread("How are","you");
		new PrintStringsThread("Thank you","very much");
	}
}
