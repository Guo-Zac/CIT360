package com.zacguo.test;

public class MyThread extends Thread {
	public void run(){
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread id: "
                               +Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(100);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
//        	for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
//           		 MyThread aThread =  new MyThread();
//           		 aThread.start();
//       		 }
		
		for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
			Thread t = new Thread(new MyRunnable());
			t.start();
		}
		
	}
}
