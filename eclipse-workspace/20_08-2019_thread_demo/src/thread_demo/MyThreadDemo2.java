package thread_demo;

public class MyThreadDemo2 implements Runnable{

	@Override
	public void run() {
		for(int j=0;j<20;j++)
		{
			System.out.println("j==> "+j);
		}
		
	}

}
