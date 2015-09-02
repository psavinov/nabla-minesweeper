package ru.nabla.minesweeper.game.field;

public class FieldPoint {

	private FieldPointState state;
	private FieldPointState mask;
	private int x;
	private int y;
	/*private Users user;*/
	
	public int getXcord(){
		return x;
	}
	
	public int getYcord(){
		return y;
	}
	
	public void setXcord(int x){
		this.x=x;
	}
	
	public void setYcord(int y){
		this.y=y;
	}
	

	public void setState(FieldPointState state){
		this.setState(state);
	}
	
	public FieldPointState getState() {
		return state;
	}

	public FieldPointState getMask() {
		return mask;
	}

	public void setMask(FieldPointState state) {
		this.mask = state;
	}
	
}
