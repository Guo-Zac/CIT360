package com.zacguo.test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyExecutorOne {
	public static void main(String[] args){
		Executor anExecutor = Executors.newCachedThreadPool();
		for(int threadCnt = 0; threadCnt < 3; threadCnt++){
			MyRunnable aSillyRunnable = 
            new MyRunnable();
			anExecutor.execute(aSillyRunnable);
		}
		try {
			Thread.sleep(5000);
			System.out.println("Done Sleeping");
			for(int threadCnt = 0; threadCnt < 3; threadCnt++){
				MyRunnable aSillyRunnable = 
                new MyRunnable();
				anExecutor.execute(aSillyRunnable);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
