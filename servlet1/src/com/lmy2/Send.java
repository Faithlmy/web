package com.lmy2;

public class Send extends Thread {
	public void run()
	{
		int i = 0;
		try {
			Thread.sleep(10*1000);
			System.out.println("������"+(++i)+"�ʼ�");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}
