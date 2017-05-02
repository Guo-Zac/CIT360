package com.zacguo.test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyExecutorOne {
	public static void main(String[] args) {
		Executor anExecutor = Executors.newCachedThreadPool();
		for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
			MyRunnable aRunnable = new MyRunnable();
			anExecutor.execute(aRunnable);
		}
	}
}
