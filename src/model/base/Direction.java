package model.base;

/**
 * 
 * @author shadow
 *
 */
public enum Direction {
	North(0), South(1), East(2), West(3);

	private final int value;

	Direction(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public static Direction getDirection(int i) {
		switch (i) {
		case 0:
			return North;
		case 1:
			return South;
		case 2:
			return East;
		case 3:
			return West;
		default:
			return null;
		}
	}
}
