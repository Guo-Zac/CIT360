package com.zacguo.test;

public class MyRunnable implements Runnable {
	String msg;

	public void run() {
		System.out.println("Thread id: " + Thread.currentThread().getName() + " with message of " + msg);
	}

	public MyRunnable(String msg) {
		this.msg = msg;
	}

	public MyRunnable() {

	}
}
