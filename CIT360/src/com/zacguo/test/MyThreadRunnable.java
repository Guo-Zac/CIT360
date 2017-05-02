package com.zacguo.test;

public class MyThreadRunnable extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread id: " + Thread.currentThread().getName());

		}
	}

	public static void main(String[] args) {
		for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
			Thread t = new Thread(new MyRunnable());
			t.start();
		}
	}
}
