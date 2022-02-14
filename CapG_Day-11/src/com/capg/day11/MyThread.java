package com.capg.day11;

import java.util.*;

//Thread is a part of process
//It shares the same memory of process
//It has life cycle
/*New --> runnable -->Running(Automatically) --> 
 * Waiting(Sleep,wait) --> 
 * Runnable(Notify,Notify ALl, Resume method)*/
class TestThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (Thread.currentThread().isDaemon()) {
				// currentThread() gives current running thread
				System.out.println(getName() + " is Daemon Thread.");
				
			}
			else {
				System.out.println("Thread class " + i + " " + currentThread().getName());
				try {
					currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

public class MyThread {
	public static void main(String[] args) {
		TestThread t1 = new TestThread();
		t1.setName("T1");

		t1.start();
		// t1.setDaemon(false);

		TestThread t2 = new TestThread();
		TestThread t3 = new TestThread();
		t3.setName("T3");
		t3.setDaemon(true);
		t3.start();
		t2.setName("T2");
		t2.start();
	}
}
