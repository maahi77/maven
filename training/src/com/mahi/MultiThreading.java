package com.mahi;

class mahi extends Thread{
	
	public void run() {
		for(int i=0;i<4;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
 class ST
 {
	 public static void main(String args[])
	 {
		 mahi m=new mahi();
		 m.start();
	
	 }
 }
 
 class Single implements Runnable{
	 public void run() {
		 for(int i=0;i<4;i++) {
				try {
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println(i);
			}
		 
	 }
	 
 }
 class SU
 {
	 public static void main(String args[])
	 {
		 Single s=new Single();
		 Thread t=new Thread(s);
		 t.start();
		 
	 }
 }

