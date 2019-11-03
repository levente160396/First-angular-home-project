package Thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class twoThreads {
	public static void main(String[] args) throws InterruptedException {
		Thread firstThread = new UserInteraction();
		firstThread.start();
		Thread secondThread = new ComputeLog();
		secondThread.start();
		firstThread.join();
		((ComputeLog) secondThread).suspend();
	}
}

class UserInteraction extends Thread {
	public void run() {
		try {
			BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Hello, how are you?");
			String in = userIn.readLine();
			System.out.println("What are you doing Today ");
			in = userIn.readLine();
			System.out.println(in + " sounds like fun.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class ComputeLog extends Thread {
	private static boolean stop = false;

	public void run() {
		try {
			int i = 1;
			double d = 0;
			while (!stop) {
				d = Math.log(i++);
				sleep(1);
			}
			System.out.println("The log of " + i + " is " + d);
		} catch (Exception e) {
			System.out.println("Thread execution was interrupted.");
		}
	}
	public void end() {
		stop = true;
	}
}
