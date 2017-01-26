package factoryOpgelost;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Machine<In extends Item, Out extends Item> {
	private static final long PROCESS_TIME = 3000;
	
	public final Set<Out> process(Set<? extends In> ins) throws InterruptedException {
		checkIn(ins);
		ins.forEach(In::setUsed);
		Thread.sleep(PROCESS_TIME);
		return build();
	}
	
	protected void checkIn(Set<? extends In> in) {
		if (in == null) {
			throw new NullPointerException("in");
		}
	}

	protected abstract Set<Out> build();
	
	// Optioneel, niet gevraagd
	@SafeVarargs
	public final Set<Out> process(In... in) throws InterruptedException {
		Set<In> inSet = Arrays.stream(in).collect(Collectors.toSet());
		return process(inSet);
	}
}