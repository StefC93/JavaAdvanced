package factoryOpgelost;

import java.util.HashSet;
import java.util.Set;

public class Woodcutter extends Machine<Tree, Log> {
	@Override
	protected Set<Log> build() {
		Set<Log> logs = new HashSet<>();
		logs.add(new Log());
		logs.add(new Log());
		return logs;
	}
}