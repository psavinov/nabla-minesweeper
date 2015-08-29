package ru.nabla.minesweeper.game.field;

public class Field {
	
	public Field(int width, int height) {
		setWidth(width);
		setHeight(height);
		setPoints(new FieldPoint[width][height]);
	}
	
	public FieldPoint[][] getPoints() {
		return points;
	}
	public void setPoints(FieldPoint[][] points) {
		this.points = points;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	private FieldPoint[][] points;
	private int width;
	private int height;
	
	

}
