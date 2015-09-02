package ru.nabla.minesweeper.game.field;

public class Field {
	
	public Field(int width, int height) {
		setWidth(width);
		setHeight(height);
		setPoints(new FieldPoint[width][height]);
		setMineCount(0);
		setCoinCount(0);
		for (int i=0;i<width;i++){
			for (int j=0;j<height;j++){
				points[i][j] = new FieldPoint();
				points[i][j].setState(FieldPointState.CLEAR);
				points[i][j].setMask(FieldPointState.CLOSE);
				points[i][j].setXcord(i);
				points[i][j].setYcord(j);	
			}
		}
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
	
	public void setMineCount(int mines){
		this.mineCount=mines;
	}
	
	public int getMineCount(){
		return mineCount;
	}
	
	public void setCoinCount(int coins){
		this.coinCount=coins;
	}
	
	public int getCoinCount(){
		return coinCount;
	}
	
	public void setMineLost(int mines){
		this.mineLost=mines;
	}
	
	public int getMineLost(){
		return mineLost;
	}

	private FieldPoint[][] points;
	private int width;
	private int height;
	private int mineCount;
	private int coinCount;
	private int mineLost;
	
	

}
