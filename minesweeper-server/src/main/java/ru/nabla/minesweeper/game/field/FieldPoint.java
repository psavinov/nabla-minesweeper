package ru.nabla.minesweeper.game.field;

public class FieldPoint {

	private FieldPointState state;
	private FieldPointState mask;
	/*private Users user;*/
	
	public FieldPointState getState() {
		return state;
	}

	public void setState(FieldPointState state) {
		this.state = state;
	}
	
	public FieldPointState getMaskState() {
		return mask;
	}

	public void setMaskState(FieldPointState state) {
		this.mask = state;
	}
	
}
