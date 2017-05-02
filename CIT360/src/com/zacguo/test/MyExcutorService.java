package com.zacguo.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExcutorService {
	public static void main(String[] args){
		ExecutorService anExecutor = Executors.newSingleThreadExecutor();
		for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
			MyRunnable aRunnable = new MyRunnable();
			anExecutor.submit(aRunnable);
		}
	}
}
