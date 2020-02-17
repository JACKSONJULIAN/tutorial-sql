package Tread;
class MyThread implements Runnable
{
	Thread t;
	String s=null;
	MyThread(String s1)
	{
		s=s1;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		System.out.println(s);
	}
	
}
public class Thread2 {
public static void main(String[] args) {
	MyThread m1= new MyThread("Thread started..");
}
}
