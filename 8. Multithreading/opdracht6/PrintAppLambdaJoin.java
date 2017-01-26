package opdracht6;

public class PrintAppLambdaJoin {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> print('*', 100));
		Thread t2 = new Thread(() -> print('#', 100));

		t1.setName("Thread1");
		t1.start();
		try {
			Thread.sleep(3000);
			if (t1.getState() != Thread.State.TERMINATED) {
				t1.interrupt();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println("You've got interrupted");
				}
				t2.start();
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println(Thread.interrupted());
		System.out.println("end");

	}

	private static void print(char c, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
			System.out.println(Thread.currentThread());
			if (Thread.interrupted() == true) {
				
				System.out.println("Einde oefening");
			} else
				System.out.print(c);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("You've got interrupted2");
			}
		}
	}

}
