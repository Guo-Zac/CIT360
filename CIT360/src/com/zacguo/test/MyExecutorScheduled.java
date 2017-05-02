package com.zacguo.test;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MyExecutorScheduled {
	static Integer second;
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
		
		Runnable task = () -> System.out.println("Time: " + new Date());
		executor.schedule(task, 1, TimeUnit.SECONDS);
		executor.schedule(task, 2, TimeUnit.SECONDS);
		ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

		TimeUnit.MILLISECONDS.sleep(1000);
		
		System.out.printf("Remaining Delay: %sms\n", future.getDelay(TimeUnit.MILLISECONDS));
		
		TimeUnit.MILLISECONDS.sleep(1000);
		
		System.out.printf("Remaining Delay: %sms\n", future.getDelay(TimeUnit.MILLISECONDS));
	}
}
