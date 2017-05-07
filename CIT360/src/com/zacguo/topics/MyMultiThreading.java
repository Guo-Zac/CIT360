package com.zacguo.topics;

import java.util.*;
import java.util.concurrent.*;

public class MyMultiThreading {
	public static void main(String[] args) throws Exception {
		String inputData = "";
		while (!inputData.equals("0")) {
			Scanner reader = new Scanner(System.in); // Reading from System.in
			printMainMenu();
			inputData = reader.next();

			switch (inputData) {
			case "1":
				mainThread();
				break;
			case "2":
				multiThread();
				break;
			case "3":
				runnableThread();
				break;
			case "4":
				executorThread();
				break;
			case "5":
				executorService();
				break;
			case "6":
				executorServiceCallable();
				break;
			case "7":
				executorScheduled();
				break;
			}

			if (!inputData.equals("0")) {
				pressAnyKeyToContinue();
			} else {
				System.out.println("-----------------------------------------------------");
				System.out.println("Program Ended. Thank you for using MyMultiThreading.java");
				System.exit(0);
			}

		}
	}

	/*
	 * This function print out a menu for interactive results.
	 */
	private static void printMainMenu() {
		System.out.println("+----------------------------------------+");
		System.out.println("|   PLEASE CHOOSE A TYPE OF COLLECTION   |");
		System.out.println("+----------------------------------------+");
		System.out.println("|   1: Main Thread                       |");
		System.out.println("|   2: Multi-Thread                      |");
		System.out.println("|   3: Thread with Runnable              |");
		System.out.println("|   4: Executor                          |");
		System.out.println("|   5: ExecutorService                   |");
		System.out.println("|   6: ExecutorService with Callable     |");
		System.out.println("|   7: ExecutorScheduled                 |");
		System.out.println("+----------------------------------------+");
		System.out.println("|   0: End the Program                   |");
		System.out.println("+----------------------------------------+");
		System.out.print("Please choose your collection: ");
	}

	/*
	 * To show that by default, everything run under main thread
	 */
	private static void mainThread() {
		System.out.println("Current thread id: " + Thread.currentThread().getName());
	}

	/*
	 * Multithreading with overwrite thread class.
	 */
	private static void multiThread() {
		for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
			MyThread aThread = new MyThread();
			aThread.start();
		}
	}

	/*
	 * multithreading with runnable
	 */
	private static void runnableThread() {
		for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
			Thread t = new Thread(new MyRunnable());
			t.start();
		}
	}

	/*
	 * multithreading with executor interface
	 */
	private static Executor executorThread() {
		Executor anExecutor = Executors.newCachedThreadPool();
		for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
			anExecutor.execute(new MyRunnable());
		}
		return anExecutor;
	}

	/*
	 * multithreading with executorservice interface It creates a pool with size
	 * of file, so 5 threads will run at the same time The 1000 tasks will
	 * distribute into those 5 threads and output
	 */
	private static ExecutorService executorService() {
		ExecutorService myES = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 1000; i++) {
			myES.submit(new MyRunnable("Task Number " + i));
		}

		return myES;
	}

	/*
	 * multithreading with executorservice interface and callable Callables will
	 * return a value when the future is done. In this case, it only return a
	 * integer value of 1001
	 */
	private static ExecutorService executorServiceCallable() throws Exception {
		ExecutorService myES = Executors.newFixedThreadPool(5);
		Future<Integer> myFuture = myES.submit(new MyCallable());
		System.out.println("future done? " + myFuture.isDone());
		Integer result = myFuture.get();
		System.out.println("future done? " + myFuture.isDone());
		System.out.print("result: " + result);
		return myES;
	}

	/*
	 * multithreading with scheduledexecutorservice This will schedule 3 tasks
	 * in 1, 2, and 3 seconds The third one will also be monitored for how many
	 * seconds of delay left
	 */
	private static ScheduledExecutorService executorScheduled() throws Exception {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

		Runnable task = () -> System.out.println("Time: " + new Date());
		executor.schedule(task, 1, TimeUnit.SECONDS);
		executor.schedule(task, 2, TimeUnit.SECONDS);
		ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

		TimeUnit.MILLISECONDS.sleep(1000);

		System.out.printf("Remaining Delay: %sms\n", future.getDelay(TimeUnit.MILLISECONDS));

		TimeUnit.MILLISECONDS.sleep(1000);

		System.out.printf("Remaining Delay: %sms\n", future.getDelay(TimeUnit.MILLISECONDS));

		return executor;
	}

	private static void pressAnyKeyToContinue() {
		try {
			Thread.currentThread().sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------------------------------");
		System.out.println("Press any key to continue...");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
}

/*
 * create a overwrite thread class
 */
class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread id: " + Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

/*
 * create a runnable class
 */
class MyRunnable implements Runnable {
	String msg;

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread id: " + Thread.currentThread().getName() + " with message of " + msg);
		}
	}

	public MyRunnable(String msg) {
		this.msg = msg;
	}

	public MyRunnable() {

	}
}

/*
 * create a callable class. Since the return will be raw, we need to define the
 * type
 */
class MyCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		TimeUnit.MILLISECONDS.sleep(100);
		return 1001;
	}
}
