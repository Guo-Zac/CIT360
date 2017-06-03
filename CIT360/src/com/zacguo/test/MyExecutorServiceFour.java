package com.zacguo.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MyExecutorServiceFour {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService myES = Executors.newFixedThreadPool(5);
		
//		for(int i = 0; i<1000; i++){
//			myES.submit(new MyRunnable("Task Number "+i));
//		}
		
		Future<Integer> myFuture = myES.submit(new MyCallable());
		System.out.println("future done? " + myFuture.isDone());
		Integer result = myFuture.get();
		System.out.println("future done? " + myFuture.isDone());
		System.out.print("result: " + result);
	}
	
	public static class MyCallable implements Callable<Integer>{

		@Override
		public Integer call() throws Exception {
			TimeUnit.SECONDS.sleep(1);
			return 1001;
		}
		
	}
}
