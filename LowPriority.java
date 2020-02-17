package Tread;

public class LowPriority 
{
public static void main(String[] args)
{
MyThread1 t1=new MyThread1(1);
MyThread1 t2=new MyThread1(2);
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.NORM_PRIORITY);
}
}
class MyThread1 extends Thread
{
	int id;
	MyThread1( int id)
	{
		this.id=id;
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("my id is"+id);
	}
}
