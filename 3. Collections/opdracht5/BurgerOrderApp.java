package opdracht5;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public abstract class BurgerOrderApp {

	public static void main(String[] args) {

		// Queue<BurgerOrder> burgers = new LinkedList<>();
		Queue<BurgerOrder> burgers = new PriorityQueue<>();

		BurgerOrder b1 = new BurgerOrder("Stef", 1);
		BurgerOrder b2 = new BurgerOrder("Marie", 2);
		BurgerOrder b3 = new BurgerOrder("Julie", 3);

		burgers.offer(b1);
		burgers.offer(b2);
		burgers.offer(b3);

		burgers.forEach(s -> System.out.println(s));
	}

}
