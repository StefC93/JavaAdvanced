package boekVoorbeeld3;

public class PrintAppLambda {

	public static void main(String[] args) {

		// Twee threads met elk hun eigen print
		Thread t1 = new Thread(() -> print('#', 100));
		Thread t2 = new Thread(() -> print('*', 100));

		// Vraagt de toestand van de thread op (NEW/RUNNABLE)
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		
		// Beide threads starten en toestand opvragen
		t1.start();
		System.out.println(t1.getState());
		t2.start();
		System.out.println(t2.getState());

		// In de main thread ook een print om aan te tonen dat dit ook een
		// thread op zichzelf is. 3 threads in totaal
		print('@', 100);
	}

	private static void print(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("#" + i + ": " + c);
		}

	}

}
