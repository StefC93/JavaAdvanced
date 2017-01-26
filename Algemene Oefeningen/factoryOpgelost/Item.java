package factoryOpgelost;

public abstract class Item {
	private boolean isUsed = false;
	
	public void setUsed() {
		if (isUsed) {
			throw new IllegalStateException("This item was used twice!");
		}
		isUsed = true;
	}
	
	@Override
	public String toString() {
		return "a " + (isUsed ? this.USED_STRING + " " : "") + this.getClass().getSimpleName();
	}
	
	protected final String USED_STRING = getUsedLabel();
	protected String getUsedLabel() {
		return "used";
	}
}