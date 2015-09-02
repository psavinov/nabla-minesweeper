package ru.nabla.minesweeper.game.field;

import java.util.Random;

public class FieldFactory {
	

	public static void main(String[] args){
		getRandomField(10,10,50,50);
	}
	
	public static Field getRandomField(int width, int height, int minesCount, int coinsCount) {
		if (width * height < minesCount+coinsCount) {
			throw new IllegalArgumentException("Incorrect mines count!");
			}
		Field field = new Field(width, height);
		field.setCoinCount(coinsCount);
		field.setMineCount(minesCount);

		/*Раскладываем мины*/
		int k=minesCount;
		while (k>0) {
			int i= new Random().nextInt(width);
			int j= new Random().nextInt(height);
			if (field.getPoints()[i][j].getState() == FieldPointState.CLEAR){
			    field.getPoints()[i][j].setState(FieldPointState.MINE);
				k--;
			}
		}
		
		/*Раскладываем монеты*/
		k=coinsCount;
		while (k>0) {
			int i= new Random().nextInt(width);
			int j= new Random().nextInt(height);
			if (field.getPoints()[i][j].getState() == FieldPointState.CLEAR){
			    field.getPoints()[i][j].setState(FieldPointState.COIN);
				k--;
			}
		}
		
		return field;
	}

}
