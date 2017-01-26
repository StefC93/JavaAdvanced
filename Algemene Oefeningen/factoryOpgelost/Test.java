package factoryOpgelost;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		new Test().run();
	}
	
	// Dit is factory v4.
	
	private void run() throws InterruptedException {
		Woodcutter woodcutter = new Woodcutter();
		Tree tree = new Tree();
		Set<Log> logs = new HashSet<>();
		
		System.out.println(tree);
		System.out.println("cutting...");
		logs = woodcutter.process(tree);
		System.out.println(tree);
		logs.forEach(System.out::println);
	}
}