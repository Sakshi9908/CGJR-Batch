package com.capg.day11;

class MyRunnableThread implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			// currentThread() gives current running thread
			System.out.println("Thread class " + i + " " + Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}

public class MyRunnable {
	public static void main(String[] args) {
		MyRunnableThread thread1 = new MyRunnableThread();
		//Creates object of thread class and gives runnable interface object
		//thread constructor passws the runnable interface
		
		Thread t1 = new Thread(thread1);
		t1.setName("T1");
		t1.start();
		
		Thread t2 = new Thread(thread1);
		t2.setName("T2");
		t2.start();
		System.gc();
	}
}
