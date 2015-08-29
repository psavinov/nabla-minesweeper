package ru.nabla.minesweeper.game.field;

public class Field {
	
	public Field(int width, int height) {
		setWidth(width);
		setHeight(height);
		setPoints(new FieldPoint[width][height]);
	}
	public FieldPointState getPointState(int x, int y){
		return points[x][y].getState();
	}
	
	public void setPointState(int x, int y, FieldPointState state){
		this.points[x][y].setState(state);
	}
	
	public FieldPoint[][] getPoints() {
		return points;
	}
	public void setPoints(FieldPoint[][] points) {
		for (int i=0;i<width;i++){
			for (int j=0;j<height;j++){
				points[i][j] = new FieldPoint();
				points[i][j].setState(FieldPointState.CLEAR);
				points[i][j].setMaskState(FieldPointState.CLOSE);
			}
		}
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
